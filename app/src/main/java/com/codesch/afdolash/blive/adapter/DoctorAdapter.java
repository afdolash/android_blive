package com.codesch.afdolash.blive.adapter;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codesch.afdolash.blive.R;
import com.codesch.afdolash.blive.model.Doctor;

import java.util.List;

/**
 * Created by Afdolash on 8/27/2017.
 */

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyViewHolder> {
    private List<Doctor> doctorList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_name, tv_address, tv_specialist;

        public MyViewHolder(View view) {
            super(view);
            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_address = (TextView) view.findViewById(R.id.tv_address);
            tv_specialist = (TextView) view.findViewById(R.id.tv_specialist);
        }
    }

    public DoctorAdapter (List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Doctor doctor = doctorList.get(position);

        holder.tv_name.setText(doctor.getName());
        holder.tv_address.setText(doctor.getAddress());
        holder.tv_specialist.setText(doctor.getSpecialist());
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }
}