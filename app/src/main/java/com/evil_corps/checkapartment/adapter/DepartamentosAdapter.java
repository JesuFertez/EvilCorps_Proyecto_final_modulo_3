package com.evil_corps.checkapartment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.evil_corps.checkapartment.R;
import com.evil_corps.checkapartment.databinding.ItemViewBinding;
import com.evil_corps.checkapartment.model.Apartamento;
import com.evil_corps.checkapartment.model.ApartamentoData;


public class DepartamentosAdapter extends RecyclerView.Adapter<DepartamentosAdapter.CustomViewHolder> {

    public ApartamentoData apartData;


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.binData(apartData.apartamentoList().get(position));
    }

    @Override
    public int getItemCount() {
        return apartData.apartamentoList().size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ItemViewBinding binding; //coneccion al item_view.xml

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemViewBinding.bind(itemView);
        }

        public void binData(Apartamento data) {      // aqui poner la data, los datos desde el layout y setearlos con los de la clase

            binding.tvNombreProyecto.setText(data.getNombreProyecto());
            binding.tvNumeroDepto.setText(data.getNumeroDepto());
            binding.tvDireccionProyecto.setText(data.getDireccion());
        }
    }
}
