package edu.ucucite.map;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);

        LatLng urdaneta = new LatLng(15.980752,120.561045);
        LatLng rosales = new LatLng(15.890332,120.635429);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.addMarker(new MarkerOptions().position(urdaneta).title("Marker in Urdaneta City University"));
        mMap.addMarker(new MarkerOptions().position(rosales).title( "Marker in My House"));

      /*  mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(-37.81319,144.96298),
                        new LatLng(-31.95285, 115.85734),
                        new LatLng(-34, 151)
                        )
                .width(10)
                .color(Color.BLUE));*/


        mMap.addPolyline( new PolylineOptions()
                .add(new LatLng(15.980752,120.561045),
                        new LatLng( 15.981128,120.561388),
                        new LatLng( 15.978823,120.565809),
                        new LatLng(   15.979251,120.571077),


                        new LatLng(15.975734,120.570803),
                        new LatLng(15.974408,120.570868),
                        new LatLng(15.972980,120.571174),
                        new LatLng( 15.972021,120.571367),
                        new LatLng(      15.970556,120.571677),

                        new LatLng( 15.969875,120.571855),

                        new LatLng(15.967977,120.572214),
                        new LatLng(  15.963872,120.573142),
        new LatLng(15.958265,120.574875),

        new LatLng(15.955300,120.575840),

                        new LatLng(  15.950451,120.577783),


        new LatLng(15.949394,120.578243),

                        new LatLng(15.945526,120.580217),
                        new LatLng(15.943308,120.580679),
                        new LatLng(15.931949,120.581147),
        new LatLng(15.928359,120.580653),
                        new LatLng(15.906280,120.585206),


//
                        new LatLng(15.898040,120.589751),
//
                        new LatLng(15.896451,120.591263),
                        new LatLng(15.885513,120.597604),
                        new LatLng(15.885864,120.602263),

                        new LatLng(15.888810,120.607942),

                        new LatLng(15.893015,120.612726),
                        new LatLng(15.894171,120.614396),
                        new LatLng(15.897865,120.622646),
                        new LatLng(15.897762,120.625738),
                        new LatLng(15.894135,120.630762),
                        new LatLng(15.893500,120.631925),
                        new LatLng(15.892891,120.632687),
                        new LatLng(15.892675,120.633412),
                        new LatLng(15.891024,120.633589),
                        new LatLng(15.891091,120.634114),
                        new LatLng(15.890250,120.634232),
                        new LatLng(15.890332,120.635429)
////
                        )

                .width(10));

        mMap.addCircle(new CircleOptions()
                .center(urdaneta));


//        //if you want to see the difference, remove the forward slash below before running
////        CameraPosition cameraPosition= new CameraPosition.Builder()
////                .target(urdaneta)
////                .zoom(17)
////                .bearing(90)
////                .tilt(40)
////                .build();
//
//        mMap.animateCamera(CameraUpdateFactory. newCameraPosition(cameraPosition));

    }
}