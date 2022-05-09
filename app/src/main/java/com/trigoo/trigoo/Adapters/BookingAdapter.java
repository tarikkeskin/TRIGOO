package com.trigoo.trigoo.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trigoo.trigoo.Entity.Booking;
import com.trigoo.trigoo.databinding.CardBookingBinding;

import java.util.List;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.CardDesingAttachment>{
    private Context mContext;
    private List<Booking> bookingList;

    public BookingAdapter(Context mContext, List<Booking> bookingList) {
        this.mContext = mContext;
        this.bookingList = bookingList;
    }

    public class CardDesingAttachment extends RecyclerView.ViewHolder {
        private CardBookingBinding tasarim;

        public CardDesingAttachment(CardBookingBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardDesingAttachment onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardBookingBinding tasarim = CardBookingBinding.inflate(layoutInflater,parent,false);
        return new CardDesingAttachment(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesingAttachment holder, int position) {
        Booking booking = bookingList.get(position);
        CardBookingBinding t = holder.tasarim;


        t.cardImageViewProfilFoto.setImageResource(
                mContext.getResources().getIdentifier(booking.getHava_resim(),"drawable",mContext.getPackageName()));

        t.cardImageViewProfilFoto.setImageResource(
                mContext.getResources().getIdentifier(booking.getProfil_resim(),"drawable",mContext.getPackageName()));

        t.textViewDerece.setText(String.valueOf(booking.getHava_derece())+"\u2103");
        t.textViewHavaDurumu.setText(booking.getHava_durumu());
        t.textViewHavaDurumuDetay.setText(booking.getHava_durumu_detay());
        t.textViewProfilName.setText(booking.getFarmer_isim());
        t.textViewBookingDetay.setText(booking.getBooking_detay());

        t.cardViewBookingPhone.setOnClickListener(view -> {
            Log.e("Buton","Arama Card!!");
        });

        t.cardImageViewProfilFoto.setOnClickListener(view -> {
            Log.e("Buton","Profil Foto!!");
        });

    }

    @Override
    public int getItemCount() {
        return bookingList.size();
    }

}
