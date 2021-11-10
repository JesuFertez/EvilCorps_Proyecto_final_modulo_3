package com.evil_corps.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.adapter.DepartamentosAdapter;
import com.evil_corps.checkapartment.databinding.FragmentListarBinding;
import com.evil_corps.checkapartment.model.apartamento.Apartamento;
import com.evil_corps.checkapartment.presenter.presenterdata.PresenterData;
import com.evil_corps.checkapartment.presenter.presenterdata.PresenterDataImplement;

import java.io.Serializable;


public class ListarFragment extends Fragment implements PresenterData{

    private FragmentListarBinding binding;
    private PresenterDataImplement presenter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater, container);
        presenter = new PresenterDataImplement(this);
        presenter.generarListado();
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentListarBinding.inflate(getLayoutInflater(), container, false);
    }

    @Override
    public void mostrarDatos(RecyclerView.Adapter adapter) {
        RecyclerView.LayoutManager layout = new LinearLayoutManager(getContext());
        binding.rvListar.setLayoutManager(layout);
        binding.rvListar.setAdapter(adapter);
    }

    @Override
    public void seleccionarItem(Bundle bundle) {
        Navigation.findNavController(getView()).navigate(R.id.action_listarParaRevisarFragment_to_contenedorCheckFragment,bundle);
    }

}
