package com.wprotheus.pdm2acessibilidade.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wprotheus.pdm2acessibilidade.R;

import java.util.List;

public class ImagemAdapter extends RecyclerView.Adapter<ImagemAdapter.ViewHolder> {
    private final Context context;
    private final List<Integer> imgIndex;

    public ImagemAdapter(Context context, List<Integer> imgIndex) {
        this.context = context;
        this.imgIndex = imgIndex;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_testes_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgTesteView.setImageResource(imgIndex.get(position));
    }

    @Override
    public int getItemCount() {
        return imgIndex.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgTesteView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgTesteView = itemView.findViewById(R.id.ivFotoPost);
        }
    }
}