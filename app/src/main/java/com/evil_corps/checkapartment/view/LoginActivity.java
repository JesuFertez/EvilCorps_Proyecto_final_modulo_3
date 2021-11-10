package com.evil_corps.checkapartment.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.databinding.LoginActivityBinding;
import com.evil_corps.checkapartment.presenter.presenterlogin.PresenterLoginImplement;
import com.evil_corps.checkapartment.presenter.presenterlogin.PresenterViewInterface;

public class LoginActivity extends AppCompatActivity implements PresenterViewInterface {

    private PresenterLoginImplement presenter;

    public LoginActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBinding();
        setContentView(binding.getRoot());
        initPresenter();
        setOnClicListener();
    }

    private void initBinding() {
        binding = LoginActivityBinding.inflate(getLayoutInflater());
    }

    private void initPresenter() {
        presenter = new PresenterLoginImplement(this);
    }

    private void setOnClicListener() {
        binding.btnIngresar.setOnClickListener(v -> {

            String mail = binding.textCorreo.getEditText().getText().toString();
            String contrasena = binding.txtPassword.getEditText().getText().toString();

            presenter.validarCuenta(mail, contrasena);

        });
    }


    @Override
    public void mostrarMensajeError() {
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle(getString(R.string.error));
        alerta.setMessage(getString(R.string.alert_msg));
        alerta.setNeutralButton(getString(R.string.ok),(dialogInterface, i) -> {
            dialogInterface.cancel();
        });
        alerta.show();
    }

    @Override
    public void limpiarErrores() {
        binding.textCorreo.setError("");
        binding.txtPassword.setError("");
    }

    @Override
    public void entrar() {

        Intent intent = new Intent(this, ContenedorFragmentos.class);
        startActivity(intent);
    }

    @Override
    public void blockearBoton() {
        binding.btnIngresar.setEnabled(false);
    }

    @Override
    public void limpiarCampos() {
        binding.textCorreo.getEditText().getText().clear();
        binding.txtPassword.getEditText().getText().clear();
    }

    @Override
    public void correoObligatorio() {
        binding.textCorreo.setError("Debe ingresar un mail");
    }

    @Override
    public void contrasenaObligatoria() {
        binding.txtPassword.setError("Debe ingresar una contraseña");
    }

    @Override
    public void rellenarCampos() {
        Toast.makeText(this, "Debe rellenar todos los campos ", Toast.LENGTH_SHORT).show();

    }
}