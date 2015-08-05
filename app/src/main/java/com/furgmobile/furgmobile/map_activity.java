package com.furgmobile.furgmobile;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map_activity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_activity);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Adiciona marcador à FURG
        LatLng carreiros = new LatLng(-32.0739, -52.1668);
        map.addMarker(new MarkerOptions().position(carreiros).title("\"Habemus mapa!\" :)"));
        map.moveCamera(CameraUpdateFactory.newLatLng(carreiros));

        // Zoom inicial da câmera de fator 15
        map.animateCamera(CameraUpdateFactory.zoomTo(15),2000,null);
    }
}