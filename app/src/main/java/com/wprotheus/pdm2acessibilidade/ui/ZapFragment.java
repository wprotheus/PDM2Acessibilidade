package com.wprotheus.pdm2acessibilidade.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.wprotheus.pdm2acessibilidade.databinding.FragmentZapBinding;
import com.wprotheus.pdm2acessibilidade.model.DataSetResumo;

public class ZapFragment extends Fragment {
    private final String FONE = "64981222697";
    private String resumoA11yZap = DataSetResumo.a11yZap();
    private String resumoA11y = DataSetResumo.a11y();
    private FragmentZapBinding zBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        zBinding = FragmentZapBinding.inflate(inflater, container, false);
        zBinding.wvResumoZap.loadData(resumoA11y, "text/html", "UTF-8");
        zBinding.btnEnviar.setOnClickListener(v -> enviarMensagemWhatsApp());
        return zBinding.getRoot();
    }

    private void enviarMensagemWhatsApp() {
        if (isAppInstalled("com.whatsapp")) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, resumoA11yZap);
            intent.setType("text/plain");
            intent.setPackage("com.whatsapp");
            startActivity(intent);
        } else {
            String url = "https://wa.me/" + FONE + "?text=" + resumoA11yZap;
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
    }

    private boolean isAppInstalled(String packageName) {
        PackageManager packageManager = getActivity().getPackageManager();
        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        zBinding = null;
    }
}