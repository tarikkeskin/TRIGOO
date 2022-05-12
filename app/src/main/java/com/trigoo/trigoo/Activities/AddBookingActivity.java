package com.trigoo.trigoo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.trigoo.trigoo.Entity.Booking;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivityAddBookingBinding;
import com.trigoo.trigoo.fragments.BookingsFragment;

import java.util.Calendar;

public class AddBookingActivity extends AppCompatActivity {
    private ActivityAddBookingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonTarih.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int yil = calendar.get(Calendar.YEAR);
            int ay = calendar.get(Calendar.MONTH);
            int gun = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dp = new DatePickerDialog(this,(d,y,a,g)->{
                binding.editTextTarih.setText(g+"/"+(a+1)+"/"+y);
            },yil,ay,gun);

            dp.setButton(DialogInterface.BUTTON_POSITIVE,"Seç",dp);
            dp.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",dp);
            dp.show();
        });

        binding.buttonRezervasyonEkle.setOnClickListener(view -> {
            String arac_sahibi = binding.editTextAracSahibi.getText().toString();
            String arac_model = binding.editTextAracModel.getText().toString();
            String booking_detay = binding.editTextBookingDetay.getText().toString();
            String tarih = binding.editTextTarih.getText().toString();
            Booking yeniBooking = new Booking(1,"gunesli","farmer_image_1",arac_sahibi,booking_detay, 22.5F,"Güneşli","Rüzgar: 2km/h",arac_model,tarih);

            BookingsFragment fragment = new BookingsFragment();

            Bundle bundle = new Bundle();

            bundle.putSerializable("newBooking",yeniBooking);

            fragment.setArguments(bundle);

            finish();

        });

        binding.imageViewCancel.setOnClickListener(view -> {
            finish();
        });
    }
}