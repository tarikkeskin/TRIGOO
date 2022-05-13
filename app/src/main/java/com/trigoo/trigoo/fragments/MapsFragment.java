package com.trigoo.trigoo.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.trigoo.trigoo.Activities.FarmerProfileActivity;
import com.trigoo.trigoo.Activities.LoginActivity;
import com.trigoo.trigoo.Activities.SignUpActivity;
import com.trigoo.trigoo.R;
import com.trigoo.trigoo.databinding.FragmentMapsBinding;

import java.util.HashMap;

public class MapsFragment extends Fragment implements SearchView.OnQueryTextListener {

    private FragmentMapsBinding tasarim;
    private GoogleMap mMap;

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            LatLng elma = new LatLng(39.918313, 33.161672);
            googleMap.addMarker(new MarkerOptions().position(elma).title("Benim Konumum"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(elma));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(elma, 12.0f));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        tasarim = FragmentMapsBinding.inflate(inflater, container, false);

        tasarim.toolbarMap.setTitle("Tractor Booking");
        //Search menu
        ((AppCompatActivity)getActivity()).setSupportActionBar(tasarim.toolbarMap);

        LatLng konum = new LatLng(39.9047175, 33.2309199);
        LatLng konum2 = new LatLng(39.9247175, 33.2409199);
        LatLng konum3 = new LatLng(39.9147175, 33.2209199);
        LatLng konum4 = new LatLng(39.9415925, 33.1755316);
        LatLng konum5 = new LatLng(39.9321012, 33.1487989);
        LatLng konum6 = new LatLng(39.971226, 33.111325);


        tasarim.fabListTractors.setOnClickListener(view -> {
            //39.9047175,33.2309199,934m

            /**
             * Markers examples for Visualization
             * 1. marker
             */

            mMap.addMarker(new MarkerOptions().position(konum).title("Elmadağ")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });

            Circle circle = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.9047175, 33.2309199))
                    .radius(600)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));

            /**
             * 2.marker
             */

            mMap.addMarker(new MarkerOptions().position(konum2).title("Kırıkkale")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });
            Circle circle2 = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.9247175, 33.2409199))
                    .radius(940)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));


            /**
             * 3.marker
             */

            mMap.addMarker(new MarkerOptions().position(konum4).title("Ediğe")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });

            Circle circle3 = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.9147175, 33.2209199))
                    .radius(520)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));



            /**
             * 4.marker
             */

            mMap.addMarker(new MarkerOptions().position(konum3).title("Altındağ")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });

            Circle circle4 = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.9415925, 33.1755316))
                    .radius(1820)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));

            /**
             * 5.marker
             */

            mMap.addMarker(new MarkerOptions().position(konum5).title("Altındağ")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });

            Circle circle5 = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.9321012, 33.1487989))
                    .radius(1520)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));

            /**
             * 6. marker
             */

            mMap.addMarker(new MarkerOptions().position(konum6).title("Mamak/Karşıyaka")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.tractor_map_green_icon)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,14f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(@NonNull Marker marker) {
                    Intent intent = new Intent(getActivity(), FarmerProfileActivity.class);
                    startActivity(intent);
                }
            });

            Circle circle6 = mMap.addCircle(new CircleOptions()
                    .center(new LatLng(39.971226, 33.111325))
                    .radius(1000)
                    .strokeColor(Color.YELLOW)
                    .strokeWidth(4)
                    .fillColor(R.color.transparent_green));


        });

        tasarim.fabMyLocation.setOnClickListener(view -> {

            LatLng elma = new LatLng(39.918313, 33.161672);
            mMap.addMarker(new MarkerOptions().position(elma).title("Benim Konumum"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(elma));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(elma, 12.0f));


        });




        return tasarim.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_search,menu);

        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);

        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        search(query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        search(newText);
        return true;
    }

    public void search(String searchText){
        Log.e("Buton",searchText);
    }



}