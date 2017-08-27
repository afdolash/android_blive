package com.codesch.afdolash.blive.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codesch.afdolash.blive.R;
import com.codesch.afdolash.blive.adapter.DoctorAdapter;
import com.codesch.afdolash.blive.model.Doctor;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private List<Doctor> doctorList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DoctorAdapter doctorAdapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        doctorAdapter = new DoctorAdapter(doctorList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(doctorAdapter);

        prepareDoctorData();

        return view;
    }

    private void prepareDoctorData() {
        Doctor doctor = new Doctor(
                "Afdolash Nur Kaffah",
                "Kandungan",
                "Kediri",
                "081111111111"
        );
        doctorList.add(doctor);
    }

}
