package com.evil_corps.checkapartment.presenter.presenterdetalle;

public interface PresenterView {
    void llenarViews(String nombreEdificio, String numeroDepto, String urlImagenEdificio);

    boolean isLucesChecked();
    boolean isDormitorioChecked();
    boolean isCocinaChecked();
    boolean isBanioChecked();
    int getRadioPosition();
    void mostrarPuntaje(String puntaje);
    void enviarMail(String nombreEdificio, String numeroDepto, int puntaje);
    void activarBoton();
}

