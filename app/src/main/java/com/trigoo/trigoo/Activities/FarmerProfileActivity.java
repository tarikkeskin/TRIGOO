package com.trigoo.trigoo.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.ActivityFarmerProfileBinding;

public class FarmerProfileActivity extends AppCompatActivity implements OnMapReadyCallback{
    private MapView mMapView;
    private MapView mMapView2;
    private ActivityFarmerProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFarmerProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mMapView = (MapView) binding.mapView;
        mMapView.onCreate(savedInstanceState);
        mMapView.getMapAsync(this);

        mMapView2 = (MapView) binding.mapView2;
        mMapView2.onCreate(savedInstanceState);
        mMapView2.getMapAsync(this);

        binding.imageViewExit.setOnClickListener(view -> {
            finish();
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
        mMapView2.onResume();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng konum = new LatLng(39.9047175, 33.2309199);
        map.addMarker(new MarkerOptions().position(new LatLng(39.9047175, 33.2309199)).title("Elmadağ"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,8f));
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        mMapView2.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mMapView.onDestroy();
        mMapView2.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
        mMapView2.onLowMemory();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);
        mMapView2.onSaveInstanceState(outState);
    }



}