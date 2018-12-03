package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Park_Locator_Fragment extends Fragment implements OnMapReadyCallback {
    View view;

    GoogleMap mGoogleMap;
    MapView mMapView;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView = view.findViewById(R.id.mapView);
        if (mMapView != null) {
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);
        }
    }

    //Coding is used to connect the exercises fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_park_locator, container, false);


        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(getContext());
        mGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        //Add markers here
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.480194, -0.151911)).title("Battersea Park, SW11").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.456700, -0.154734)).title("Clapham Common Park, SW4").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.455698, -0.152984)).title("Clapham Common Park, SW4").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.460422, -0.153757)).title("Clapham Common Park, SW4").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.473819, -0.153441)).title("Doddington Estate, SW11").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.484411, -0.107379)).title("Kennington Park, London").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.528457, -0.042422)).title("Meath Gardens, London").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.527119, -0.295562)).title("Hanger Hill Park, London").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.470229, -0.183119)).title("Imperial Wharf, SW6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.468623, -0.110509)).title("Brixton, SW9").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.469536, -0.110017)).title("Angel Town Park, Brixton, SW9").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.488122, -0.083382)).title("Surrey Square Park, SE17").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.488371, -0.120589)).title("Glasswalk Playground, Vauxhall, SE11").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.462166, -0.026507)).title("Hilly Fields, Brockley, London").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.527403, -0.064517)).title("Pollard Square, Bethnal Green").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.414986, -0.296522)).title("Elm Road Open Space, Kingston Upon Thames ").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.483745, -0.412490)).title("Avenue Park, Hounslow").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.409975, -0.064393)).title("Betts Park, Bromley, SE20").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.515796, -0.013743)).title("Langdon Park, Poplar, E14 ").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.359743, -0.223477)).title("Cheam Park, Epsom and Ewell, SM3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.446683, -0.349802)).title("Kneller Gardens, Twickenham, TW2").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.478041, -0.055502)).title("Brimmington Park, Peckham, SE15").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.497706, -0.026211)).title("Sir John McDougall Gardens, London, E14").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.484827, -0.206528)).title("Normand Park, Fulham, SW6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.520635, -0.188363)).title("Westbourne Green Open Space, London, W2").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.461710, -0.236416)).title("The Pleasance, Roehampton, SW19").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.390902, -0.235335)).title("Sir Joseph Hood Memorial Playing Fields, Motspur Park, SW19").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.501790, -0.0973717)).title("Mint Street Park, Borough, SE1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.595370, 0.184635)).title("Rise Park, Romford, RM1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.490000, 0.132746)).title("Lesnes Abbey Wood Recreation Ground, Belvedere, DA17").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.562108, 0.207147)).title("Harrow Lodge Park, Hornchurch, RM12").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.570817, -0.126574)).title("Elthorne Park, Crouch Hill, N19").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.538624, -0.060254)).title("London Fields East Side, E10").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.489173, -0.011929)).title("Millwall Park, Isle of Dogs, E14").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.458256, -0.058076)).title("Peckham Rye Park, SE15").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.491428, -0.318623)).title("Boston Manor Park, Brentford, TW8").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.519342, -0.243288)).title("Wormwood Scrubs, London, W12").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.520490, -0.235950)).title("Wormwood Scrubs (Linford Christie Stadium), W12").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.588166, -0.323730)).title("Kenton Recreation Ground, Harrow, HA3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.523825, 0.045311)).title("Brampton Park, East Ham, E6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.547662, 0.080257)).title("Loxford Park, Ilford, IG1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.535614, 0.064049)).title("Barking Road Recreation Ground, Barking, E6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.482136, -0.239311)).title("Castelnau Recreation Ground, Barnes, SW13").snippet("Outdoor Fitness Gym"));






        CameraPosition London = CameraPosition.builder().target(new LatLng(51.460422, -0.153757)).zoom(8).bearing(0).tilt(0).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(London));



    }




}


