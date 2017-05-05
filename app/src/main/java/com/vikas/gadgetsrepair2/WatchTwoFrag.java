package com.vikas.gadgetsrepair2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Onefragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Onefragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WatchTwoFrag extends Fragment {
    public WatchTwoFrag() {
        // Required empty public constructor
    }
    DatabaseHelpher helpher1,helpher2;
    List<DatabaseModel> dbList1,dbList2;
    RecyclerView mRecyclerView1,mRecyclerView2;
    private RecyclerView.Adapter mAdapter1,mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager1,mLayoutManager2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.frag_watch_two, container, false);
        // expandableLayout1 = (ExpandableRelativeLayout) rootView.findViewById(R.id.expandableLayout1);

        helpher1 = new DatabaseHelpher(getActivity());
        // helpher2 = new DatabaseHelpher(getActivity());
        dbList1= new ArrayList<DatabaseModel>();
        dbList1 = helpher1.getDataFromDBwsw();
        //dbList2= new ArrayList<DatabaseModel>();
        //dbList2 = helpher2.getDataFromDBB();

        mRecyclerView1 = (RecyclerView)rootView.findViewById(R.id.recycleviewwsw);
        mRecyclerView1.setHasFixedSize(true);

        //mRecyclerView2 = (RecyclerView)rootView.findViewById(R.id.recycleviewom);
        //mRecyclerView2.setHasFixedSize(true);

        mLayoutManager1 = new LinearLayoutManager(getActivity());
        //mLayoutManager2 = new LinearLayoutManager(getActivity());
        mRecyclerView1.setLayoutManager(mLayoutManager1);
        //mRecyclerView2.setLayoutManager(mLayoutManager2);

        // specify an adapter (see also next example)
        mAdapter1 = new RecyclerNine(getActivity(),dbList1);
        mRecyclerView1.setAdapter(mAdapter1);
        //mAdapter2 = new RecyclerTwo(getActivity(),dbList2);
        //mRecyclerView2.setAdapter(mAdapter2);

        return rootView;
    }
}