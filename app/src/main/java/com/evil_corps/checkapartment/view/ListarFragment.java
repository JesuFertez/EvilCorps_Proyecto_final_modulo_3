package com.evil_corps.checkapartment.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.adapter.ApartamentoAdapter;
import com.evil_corps.checkapartment.databinding.FragmentListarBinding;
import com.evil_corps.checkapartment.presenter.presenterdata.PresenterData;
import com.evil_corps.checkapartment.presenter.presenterdata.PresenterDataImplement;


public class ListarFragment extends Fragment implements PresenterData{

    private FragmentListarBinding binding;
    private PresenterDataImplement presenter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){

        presenter = new PresenterDataImplement(this);
        presenter.generarListado();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentListarBinding.inflate(getLayoutInflater(), container, false);
    }

    @Override
    public void mostrarDatos(ApartamentoAdapter adapter) {

        binding.rvListar.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvListar.setAdapter(adapter);

        adapter.setListener(apartamento ->{
            presenter.generarBundle(apartamento);
        });
    }

    @Override
    public void seleccionarItem(Bundle bundle) {
        Navigation.findNavController(getView()).navigate(R.id.action_listarParaRevisarFragment_to_contenedorCheckFragment,bundle);
    }

}
