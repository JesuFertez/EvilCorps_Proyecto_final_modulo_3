package com.evil_corps.checkapartment.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.evil_corps.checkapartment.databinding.FragmentContenedorCheckBinding;
import com.evil_corps.checkapartment.presenter.presenterdetalle.PresenterDetalleImplement;
import com.evil_corps.checkapartment.presenter.presenterdetalle.PresenterView;

public class ContenedorCheckFragment extends Fragment implements PresenterView {
 private FragmentContenedorCheckBinding binding;
    private PresenterDetalleImplement presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initBinding(inflater,container);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        initPresenter();
        setListenerBoton();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding=FragmentContenedorCheckBinding.inflate(inflater, container, false);
    }

    private void initPresenter() {
        presenter= new PresenterDetalleImplement(this);
        getArguments().getSerializable("apartamento");
        presenter.obtenerApartamento(getArguments());
    }

    private void setListenerBoton() {
        binding.btGuardar.setOnClickListener(v ->{
            presenter.calcularPuntaje();
        });
        binding.btAlerta.setOnClickListener(v -> {
            presenter.generarAlerta();
        });
    }

    @Override
    public void llenarViews(String nombreEdificio, String numeroDepto, String urlImagenEdificio) {

        binding.tvCondominio.setText(nombreEdificio);
        binding.tvNumeroDpto.setText(numeroDepto);
        Glide.with(this).load(urlImagenEdificio).into(binding.imageViewGlide);

    }

    @Override
    public boolean isLucesChecked() {
        return binding.chkLuces.isChecked();
    }

    @Override
    public boolean isDormitorioChecked() {
        return binding.chkDormitorio.isChecked();
    }

    @Override
    public boolean isCocinaChecked() {
        return binding.chkCocina.isChecked();
    }

    @Override
    public boolean isBanioChecked() {
        return binding.chkBaO.isChecked();
    }

    @Override
    public int getRadioPosition() {
        int radioButtonID = binding.rdgButon.getCheckedRadioButtonId();
        View radioButton = binding.rdgButon.findViewById(radioButtonID);
        int idx = binding.rdgButon.indexOfChild(radioButton);
        return idx;
    }

    @Override
    public void mostrarPuntaje(String puntaje) {

    }

    @Override
    public void enviarMail(String nombreEdificio, String numeroDepto, int puntaje) {

    }

    @Override
    public void activarBoton() {

    }
}