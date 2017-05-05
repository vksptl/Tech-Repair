package com.vikas.gadgetsrepair2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Onefragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Onefragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LapOneFrag extends Fragment {
    public LapOneFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_lap_one, container, false);
    }
}