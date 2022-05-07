package com.trigoo.trigoo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.FragmentBookingsBinding;


public class BookingsFragment extends Fragment {

    private FragmentBookingsBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentBookingsBinding.inflate(inflater, container, false);

        tasarim.toolbarBooking.setTitle("Booking");

        return tasarim.getRoot();
    }
}