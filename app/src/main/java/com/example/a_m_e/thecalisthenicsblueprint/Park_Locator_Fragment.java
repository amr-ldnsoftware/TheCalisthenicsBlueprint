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

        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.544800, -0.197445)).title("Kilburn Grange Park, West Hampstead, NW6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.536980, -0.157818)).title("Primrose Hill, London, NC1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.498084, -0.116704)).title("Archbichops Park, Lambeth, SE1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.529797, -0.191523)).title("Paddington Recreation Ground, Maida Vale, W9").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.534704, -0.208740)).title("Queens Park, London, NW6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.556692, -0.156856)).title("Parliament Hill Fields, Gospel Oak, N19").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.546309, -0.009722)).title("East Village, Stratford, E20").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.539835, 0.017229)).title("West Ham Park, West Ham, E15").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.581932, -0.153087)).title("Highgate Woods, Highgate, N6").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.450738, -0.170507)).title("Wandsworth Common, London, SW18").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.539581, -0.031767)).title("Victoria Park, Hackney, E3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.542958, -0.042448)).title("Well Street Common Park, Hackney, E9").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.538985, -0.059738)).title("London Fields East Side, Hackney, E8").snippet("Outdoor Fitness Gym"));


        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.461100, -0.428396)).title("Bedfont Sports Club, Feltham, TW14").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.597121, -0.037137)).title("Higham Hill Park, Walthamstow, E17").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.500253, -0.202165)).title("Holland Park, Kensington, W8").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.523732, -0.220946)).title("Sunbeam Gardens, North Kensington, W10").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.572458, -0.413461)).title("Ruislip Manor Station, London, HA4").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.595022, -0.097976)).title("Russell Park, Wood Green, N22").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.441383, -0.332020)).title("Radinor Gardens, Strawberry Hill, TW1").snippet("Outdoor Fitness Gym"));

        //Surrey and other counties
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.337080, -0.272896)).title("Court Recreation Ground, Epsom, KT19").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.593827, -1.702115)).title("Nightingale Woods Cycle Ride, Swindon, SN3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.538530, -1.774985)).title("Pipers Way, North Wroughton, SN38").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.452168, -2.605830)).title("Brandon Hill, Bristol, BS1").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.550650, 0.595445)).title("Hadleigh Park, Benfleet, SS7").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.393401, 0.567060)).title("The Strand Leisure Park, Gillingham, ME7").snippet("Outdoor Fitness Gym"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.354390, 0.570284)).title("Hempstead Park, Gillingham, ME7").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.354390, 0.570284)).title("Langdon Playing Fields, Dover, ME7").snippet("Outdoor Fitness Gym"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.841969, -0.214601)).title("Easthill Park, Brighton and Hove, BN41").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.842571, -0.170798)).title("Hove Park, Brighton and Hove, BN3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.826662, -0.197749)).title("Hove Lagoon, Brighton and Hove, BN3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.823660, -1.081983)).title("Mountbatten Centre, Portsmouth, PO2").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.910577, -1.306288)).title("Hedge End, Southampton, SO30").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.927373, -1.407440)).title("Southampton Common, Southampton, SO15").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.866903, -1.863883)).title("Potterne Park, Verwood, BH21").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.615377, -3.412511)).title("Esplanade, Exmouth, EX8").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(50.631457, -4.358209)).title("Coronation Park, Launceston, PL15").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.288868, -2.481710)).title("West Clewes Recreation Ground, Radstock, BA3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.288868, -2.481710)).title("West Clewes, Midsomer Norton, BA3").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.547012, -1.892854)).title("Longleaze Park, Wiltshire, SN4").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.264806, -1.062547)).title("Basing Lime Pits, Basingstoke, RG24").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.266619, -1.074660)).title("Eastrop Park, Basingstoke, RG21").snippet("Outdoor Fitness Gym"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(51.348484, -0.872446)).title("Eversley, Hampshire, RG27").snippet("Outdoor Fitness Gym"));




        CameraPosition London = CameraPosition.builder().target(new LatLng(51.460422, -0.153757)).zoom(4).bearing(0).tilt(0).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(London));



    }




}


