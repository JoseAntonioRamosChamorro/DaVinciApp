package com.example.davinciapp.ui.inventor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.davinciapp.R;
import com.example.davinciapp.ui.cientifica.CientViewModel;


public class FragmentInventor extends Fragment {
    private InventViewModel inventViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inventViewModel =
                new ViewModelProvider(this).get(InventViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inventor, container, false);
        final TextView textView = root.findViewById(R.id.txtanque);
        inventViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}