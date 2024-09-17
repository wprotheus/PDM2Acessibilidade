package com.wprotheus.pdm2acessibilidade.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wprotheus.pdm2acessibilidade.databinding.FragmentTesteBinding;
import com.wprotheus.pdm2acessibilidade.model.DataSetResumo;
import com.wprotheus.pdm2acessibilidade.utils.ImagemAdapter;

import java.util.List;

public class TesteFragment extends Fragment {
    private FragmentTesteBinding tBinding;
    private List<Integer> imgTeste = DataSetResumo.imgIndices();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tBinding = FragmentTesteBinding.inflate(inflater, container, false);

        RecyclerView rvTesteView = tBinding.rvTeste;
        rvTesteView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        ImagemAdapter adapter = new ImagemAdapter(getContext(), imgTeste);
        rvTesteView.setAdapter(adapter);
        return tBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        tBinding = null;
    }
}