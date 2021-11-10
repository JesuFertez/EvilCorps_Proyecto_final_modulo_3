package com.evil_corps.checkapartment.presenter.presenterdetalle;

import android.os.Bundle;

import com.evil_corps.checkapartment.model.apartamento.Apartamento;

public class PresenterDetalleImplement implements presenterLogic {


    private PresenterView view;
    Apartamento apartamento;
    int puntaje;

    public PresenterDetalleImplement(PresenterView view) { this.view = view; }

    @Override
    public void obtenerApartamento(Bundle bundle) {
        apartamento = (Apartamento) bundle.getSerializable("apartamento");
        view.llenarViews(apartamento.getNombreEdificio(),apartamento.getNumeroDepto(), apartamento.getUrlImagenEdificio());

    }
    @Override
    public void calcularPuntaje() {

        puntaje = 0;
        if (view.isLucesChecked())
        {
            puntaje += 10;
        }
        if (view.isDormitorioChecked())
        {
            puntaje += 20;
        }
        if(view.isCocinaChecked())
        {
            puntaje += 30;
        }
        if (view.isBanioChecked())
        {
            puntaje += 40;
        }
        switch(view.getRadioPosition())
        {
            case 0: puntaje *= 3; break;
            case 1: puntaje *= 2; break;
        }
        view.mostrarPuntaje(String.valueOf(puntaje));

        if (puntaje < 130)
        {
            view.activarBoton();
        }
    }

    @Override
    public void generarAlerta() {
    view.enviarMail(apartamento.getNombreEdificio(), apartamento.getNumeroDepto(),puntaje);
    }
}
