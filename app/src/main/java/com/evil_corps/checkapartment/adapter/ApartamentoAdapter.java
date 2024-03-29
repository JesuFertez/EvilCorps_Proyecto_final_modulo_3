package com.evil_corps.checkapartment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.databinding.ItemViewBinding;
import com.evil_corps.checkapartment.model.apartamento.Apartamento;

import java.util.ArrayList;


public class ApartamentoAdapter extends RecyclerView.Adapter<ApartamentoAdapter.CustomViewHolder>{


    private ArrayList<Apartamento> lista;
    private OnClickListener listener; //2 declarar un onClicListener

    public ApartamentoAdapter(ArrayList<Apartamento> lista) { this.lista = lista; }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new CustomViewHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.binData(lista.get(position));
    }

    @Override
    public int getItemCount() { return lista.size(); }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ItemViewBinding binding; //coneccion al item_view.xml
        private OnClickListener listener; // 4 declarar atributo

        public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);

            binding = ItemViewBinding.bind(itemView);
            this.listener = listener; //5 inicializarlo en CustomViewHolder

        }

        public void binData(Apartamento apartamento) {      // aqui poner la data, los datos desde el layout y setearlos con los de la clase

            binding.tvNombreProyecto.setText(apartamento.getNombreProyecto());
            binding.tvNumeroDepto.setText(apartamento.getNumeroDepto());
            binding.tvDireccionProyecto.setText(apartamento.getDireccion());
            itemView.setOnClickListener(v -> { // declarar un itemView onClick y pasarle el listener ligado a los datos(Array)
                listener.onAparmentClick(apartamento);
            });
        }


    }

    public interface OnClickListener {
        void onAparmentClick (Apartamento apartamento);
    }

    public void setListener(OnClickListener listener) { this.listener = listener; }
}
