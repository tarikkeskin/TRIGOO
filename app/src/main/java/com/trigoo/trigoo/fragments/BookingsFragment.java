package com.trigoo.trigoo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trigoo.trigoo.Adapters.BookingAdapter;
import com.trigoo.trigoo.Entity.Booking;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.FragmentBookingsBinding;

import java.util.ArrayList;


public class BookingsFragment extends Fragment {

    private FragmentBookingsBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentBookingsBinding.inflate(inflater, container, false);

        tasarim.toolbarBooking.setTitle("Booking");

        tasarim.buttonYeni.setOnClickListener(view -> {
            Log.e("Buton","Yeni");
        });

        tasarim.buttonEslesmis.setOnClickListener(view -> {
            Log.e("Buton","eşl");
        });

        tasarim.buttonTamamlanan.setOnClickListener(view -> {
            Log.e("Buton","Yetammni");
        });

        ArrayList<Booking> bookingArrayList = new ArrayList<>();
        Booking b1 = new Booking(1,"gunesli","farmer_image_1","Hüseyin Demirci","Biçerdöver Hizmeti, 18 Mayıs 2022, Çarşamba", 22.5F,"Güneşli","Rüzgar: 2km/h");
        Booking b2 = new Booking(2,"yagmurlu","farmer_image_2","Ahmet Dayıoğlu","Ekim,İkileme,Gübre Yükleme Hizmeti, 23 Mayıs 2022, Pazartesi", 18.5F,"Hafif Yağışlı","Rüzgar: 5km/h");
        Booking b3 = new Booking(3,"gunesli","farmer_image_1","Hüseyin Demirci","Çapalama,Hasat,Ekim Hizmeti, 26 Mayıs 2022, Perşembe", 21.8F,"Güneşli","Rüzgar: 1.8km/h");
        bookingArrayList.add(b1);
        bookingArrayList.add(b2);
        bookingArrayList.add(b3);

        BookingAdapter adapter = new BookingAdapter(requireContext(),bookingArrayList);
        tasarim.rv.setAdapter(adapter);

        return tasarim.getRoot();
    }
}