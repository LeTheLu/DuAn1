package com.android.carrental.admin.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.android.carrental.R;
import com.android.carrental.admin.AddCar;
import com.android.carrental.admin.AddCarModel;
import com.android.carrental.admin.AddStation;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        final ImageButton addcar = root.findViewById(R.id.addcar);
        final ImageButton addcarmodel = root.findViewById(R.id.addcarmodel);
        final ImageButton addcarstation = root.findViewById(R.id.addstation);
        addcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddCarScreen();
            }
        });
        addcarmodel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddCarModelScreen();
            }
        });
        addcarstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddStationScreen();
            }
        });
        return root;
    }
    private void openAddCarScreen() {
        Intent intent = new Intent(getContext(), AddCar.class);
        startActivity(intent);
    }
    private void openAddCarModelScreen() {
        Intent intent = new Intent(getContext(), AddCarModel.class);
        startActivity(intent);

    }
    private void openAddStationScreen() {
        Intent intent = new Intent(getContext(), AddStation.class);
        startActivity(intent);
    }
}