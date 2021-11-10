package com.evil_corps.checkapartment.presenter.presenterdetalle;

import android.os.Bundle;

import com.evil_corps.checkapartment.model.apartamento.Apartamento;

public class PresenterDetalleImplement implements presenterLogic {

    Apartamento apartamento;

    @Override
    public void mostrarDetalle() {

    }

    @Override
    public void calcularPuntaje() {

    }

    @Override
    public void tomarAccion(Bundle bundle) {
        apartamento = (Apartamento) bundle.getSerializable("apartamento");


    }
}
