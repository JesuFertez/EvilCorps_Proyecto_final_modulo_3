package com.evil_corps.checkapartment.presenter.presenterdata;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import com.evil_corps.checkapartment.adapter.ApartamentoAdapter;
import com.evil_corps.checkapartment.model.apartamento.Apartamento;

public interface PresenterData {

    void mostrarDatos (ApartamentoAdapter adapter);
    void seleccionarItem(Bundle bundle);

}
