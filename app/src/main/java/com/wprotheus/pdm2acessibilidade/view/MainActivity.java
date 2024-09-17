package com.wprotheus.pdm2acessibilidade.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.wprotheus.pdm2acessibilidade.ui.HomeFragment;
import com.wprotheus.pdm2acessibilidade.R;
import com.wprotheus.pdm2acessibilidade.ui.ResumoFragment;
import com.wprotheus.pdm2acessibilidade.ui.TesteFragment;
import com.wprotheus.pdm2acessibilidade.ui.ZapFragment;
import com.wprotheus.pdm2acessibilidade.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private HomeFragment hFragment;
    private ResumoFragment rFragment;
    private ZapFragment zFragment;
    private TesteFragment tFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inicializandoFragmentos();
        listenerFragmentos();
        alternandoFragmentos(hFragment);
    }

    private void inicializandoFragmentos() {
        hFragment = new HomeFragment();
        rFragment = new ResumoFragment();
        zFragment = new ZapFragment();
        tFragment = new TesteFragment();
    }

    private void listenerFragmentos() {
        mBinding.btnHome.setOnClickListener(v -> alternandoFragmentos(hFragment));
        mBinding.btnResumo.setOnClickListener(v -> alternandoFragmentos(rFragment));
        mBinding.btnAlly.setOnClickListener(v -> alternandoFragmentos(tFragment));
        mBinding.btnZap.setOnClickListener(v -> alternandoFragmentos(zFragment));
    }

    private void alternandoFragmentos(Fragment destino) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragmentos, destino).commit();
    }
}