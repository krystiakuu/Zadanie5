package com.example.zadanie5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private int licznikPolubien = 0;
    private TextView licznikPolubienTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private void initializeUIComponents() {
        licznikPolubienTextView = findViewById(R.id.like_counter);
    }

    private void setupButtonListeners() {
        Button przyciskPolub = findViewById(R.id.button_like);
        Button przyciskUsun = findViewById(R.id.button_remove);

        przyciskPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zwiekszLicznikPolubien();
            }
        });

        przyciskUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zmniejszLicznikPolubien();
            }
        });
    }

    private void zwiekszLicznikPolubien() {
        licznikPolubien++;
        aktualizujWyswietlaniePolubien();
    }

    private void zmniejszLicznikPolubien() {
        if (licznikPolubien > 0) {
            licznikPolubien--;
            aktualizujWyswietlaniePolubien();
        }
    }

    private void aktualizujWyswietlaniePolubien() {
        licznikPolubienTextView.setText(licznikPolubien + " polubień");
    }
}