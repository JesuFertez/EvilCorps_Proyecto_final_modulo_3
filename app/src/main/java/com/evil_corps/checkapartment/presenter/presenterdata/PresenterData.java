package com.evil_corps.checkapartment.presenter.presenterdata;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import com.evil_corps.checkapartment.model.apartamento.Apartamento;

public interface PresenterData {

    void mostrarDatos (RecyclerView.Adapter adapter);
    void seleccionarItem(Bundle bundle);

}
