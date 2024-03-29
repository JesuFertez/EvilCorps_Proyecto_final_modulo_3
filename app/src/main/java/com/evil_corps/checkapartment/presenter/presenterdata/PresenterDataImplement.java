package com.evil_corps.checkapartment.presenter.presenterdata;

import android.os.Bundle;

import androidx.navigation.Navigation;

import com.evil_corps.checkapartment.adapter.ApartamentoAdapter;
import com.evil_corps.checkapartment.model.apartamento.Apartamento;
import com.evil_corps.checkapartment.model.apartamento.ApartamentoData;

import java.io.Serializable;
import java.util.ArrayList;


public class PresenterDataImplement implements PresenterView{
private PresenterData datos;

    public PresenterDataImplement(PresenterData datos) {
        this.datos = datos;
    }

    @Override
    public void generarListado() {
        ApartamentoAdapter adapter = new ApartamentoAdapter((ArrayList<Apartamento>) ApartamentoData.apartamentoList());
        datos.mostrarDatos(adapter);
    }

    @Override
    public void generarBundle(Apartamento apartamento) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("apartamento",apartamento);
            datos.seleccionarItem(bundle);
    }


}
