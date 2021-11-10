package com.evil_corps.checkapartment.presenter.presenterdata;

import com.evil_corps.checkapartment.model.apartamento.Apartamento;

public interface PresenterView {

    void generarListado();
    void generarBundle (Apartamento apartamento);

}
