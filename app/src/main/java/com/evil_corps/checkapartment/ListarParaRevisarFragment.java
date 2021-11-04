package com.evil_corps.checkapartment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evil_corps.checkapartment.databinding.FragmentListarParaRevisarBinding;


public class ListarParaRevisarFragment extends Fragment {

    FragmentListarParaRevisarBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater,container);
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentListarParaRevisarBinding.inflate(getLayoutInflater(),container,false);
    }
}