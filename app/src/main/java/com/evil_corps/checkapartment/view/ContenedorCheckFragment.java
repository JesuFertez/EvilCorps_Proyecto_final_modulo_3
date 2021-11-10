package com.evil_corps.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.databinding.FragmentContenedorCheckBinding;
import com.evil_corps.checkapartment.presenter.presenterdetalle.PresenterDetalleImplement;

public class ContenedorCheckFragment extends Fragment {
 private FragmentContenedorCheckBinding binding;
    private PresenterDetalleImplement presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater,container);
        initPresenter();
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding=FragmentContenedorCheckBinding.inflate(inflater, container, false);
    }
    private void initPresenter() {
        presenter= new PresenterDetalleImplement();
        getArguments().getSerializable("apartamento");
        presenter.tomarAccion(getArguments());
    }
}