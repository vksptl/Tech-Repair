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
public class TrackOneFrag extends Fragment {
    public TrackOneFrag() {
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
        return inflater.inflate(R.layout.frag_track_one, container, false);
    }
}