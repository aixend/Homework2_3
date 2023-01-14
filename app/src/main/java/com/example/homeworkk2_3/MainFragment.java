package com.example.homeworkk2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {
    Button btnPlus,btnMinus;
    TextView tvResult;
    Integer counter = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    initView();
    initClick();
    }

    private void initClick() {
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter +=1;
                tvResult.setText(counter.toString());
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter -=1;
                tvResult.setText(counter.toString());
            }
        });
    }

    private void initView() {
        btnPlus =requireActivity().findViewById(R.id.btn_plus);
        btnMinus = requireActivity().findViewById(R.id.btn_minus);
        tvResult = requireActivity().findViewById(R.id.tv_result);
    }

}