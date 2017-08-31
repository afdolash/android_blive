package com.codesch.afdolash.blive.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.codesch.afdolash.blive.R;
import com.codesch.afdolash.blive.activity.AccountActivity;
import com.codesch.afdolash.blive.activity.ChangeAddressActivity;
import com.codesch.afdolash.blive.activity.ChangeBirthdayActivity;
import com.codesch.afdolash.blive.activity.ChangeGenderActivity;
import com.codesch.afdolash.blive.activity.ChangeNameActivity;
import com.codesch.afdolash.blive.activity.ChangePhoneNumActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    LinearLayout lin_changeAccount, lin_name, lin_dateOfBirth, lin_gender, lin_phoneNum, lin_address;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        lin_changeAccount = (LinearLayout) view.findViewById(R.id.lin_changeAccount);
        lin_name = (LinearLayout) view.findViewById(R.id.lin_name);
        lin_dateOfBirth = (LinearLayout) view.findViewById(R.id.lin_dateOfBirth);
        lin_gender = (LinearLayout) view.findViewById(R.id.lin_gender);
        lin_phoneNum = (LinearLayout) view.findViewById(R.id.lin_phoneNum);
        lin_address = (LinearLayout) view.findViewById(R.id.lin_address);

        lin_changeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AccountActivity.class);
                getActivity().startActivity(intent);
            }
        });

        lin_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChangeNameActivity.class);
                getActivity().startActivity(intent);
            }
        });

        lin_dateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChangeBirthdayActivity.class);
                getActivity().startActivity(intent);
            }
        });

        lin_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChangeGenderActivity.class);
                getActivity().startActivity(intent);
            }
        });

        lin_phoneNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChangePhoneNumActivity.class);
                getActivity().startActivity(intent);
            }
        });

        lin_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ChangeAddressActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

}
