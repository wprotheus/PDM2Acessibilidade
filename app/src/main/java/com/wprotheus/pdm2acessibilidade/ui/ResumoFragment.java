package com.wprotheus.pdm2acessibilidade.ui;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.wprotheus.pdm2acessibilidade.databinding.FragmentResumoBinding;
import com.wprotheus.pdm2acessibilidade.model.DataSetResumo;

import java.util.Locale;

public class ResumoFragment extends Fragment implements TextToSpeech.OnInitListener {
    private String resumo10ToSpeech = DataSetResumo.dezDicasToSpeech();
    private String resumo10 = DataSetResumo.dezDicas();
    private FragmentResumoBinding frBinding;
    private TextToSpeech toSpeech;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        frBinding = FragmentResumoBinding.inflate(inflater, container, false);
        toSpeech = new TextToSpeech(getContext(), this);
        frBinding.wvResumo.loadData(resumo10, "text/html", "UTF-8");
        return frBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        toSpeech.stop();
        frBinding = null;
    }

    @Override
    public void onInit(int status) {
        Locale locale = new Locale("pt", "BR");
        if (status == TextToSpeech.SUCCESS) {
            int resultLocale = toSpeech.setLanguage(locale);
            toSpeech.setSpeechRate(0.71f);
            if (resultLocale == TextToSpeech.LANG_MISSING_DATA ||
                    resultLocale == TextToSpeech.LANG_NOT_SUPPORTED)
                Log.e("Problemas", "Problemas com o idioma escolhido.");
            else
                toSpeech.speak(resumo10ToSpeech, TextToSpeech.QUEUE_FLUSH, null, null);
        } else
            Log.e("Problemas", "Problemas com o TextToSpeech.");
    }
}