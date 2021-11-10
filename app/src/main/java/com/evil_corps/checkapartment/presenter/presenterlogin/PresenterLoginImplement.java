package com.evil_corps.checkapartment.presenter.presenterlogin;


import android.util.Patterns;

public class PresenterLoginImplement implements LoginPresenter {

    private PresenterViewInterface view;
    private int cont =0;

    public PresenterLoginImplement(PresenterViewInterface view) { this.view=view; }


    @Override
    public boolean validarCuenta(String mail, String contrasena) {

        view.limpiarErrores();

        if(mail.trim().isEmpty()){
            view.correoObligatorio();
            return false;
        }
        if(contrasena.trim().isEmpty()){
            view.contrasenaObligatoria();
            return false;
        }

        if (!mail.trim().isEmpty() && !contrasena.trim().isEmpty()) {
            if (contrasena.equals("123Pass") && Patterns.EMAIL_ADDRESS.matcher(mail).matches()) {
                view.entrar();
                return true;
            } else {
                cont ++;
                view.mostrarMensajeError();
                view.limpiarCampos();

                if(cont == 3){
                    view.blockearBoton();
                }
                return false;
            }
        } else {
            view.mostrarMensajeError();
        }
        return false;
    }



}
