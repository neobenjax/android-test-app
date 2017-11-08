package com.example.benjamin.initialapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String CITA = "cita";
    private static final String AUTOR= "autor";
    private static final String COLOR = "color";

    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaCitaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citaTextView = (TextView) findViewById(R.id.citaTextView);
        autorTextView = (TextView) findViewById(R.id.autorTextView);
        nuevaCitaButton = (Button) findViewById(R.id.nuevaCitaButton);

        nuevaCita(null);



        /*nuevaCitaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click me");
            }
        });*/

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(CITA, citaTextView.getText().toString());
        outState.putString(AUTOR, autorTextView.getText().toString());
        outState.putInt(COLOR, autorTextView.getCurrentTextColor());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int color = savedInstanceState.getInt(COLOR);
        citaTextView.setTextColor(color);
        autorTextView.setTextColor(color);
        nuevaCitaButton.setBackgroundColor(color);
        citaTextView.setText(savedInstanceState.getString(CITA));
        autorTextView.setText(savedInstanceState.getString(AUTOR));

    }

    public void nuevaCita(View view) {

        GeneradorCitas generadorCitas = new GeneradorCitas();
        Cita cita = generadorCitas.obtenerCitaRandom();

        citaTextView.setText(cita.getTexto());
        citaTextView.setTextColor(cita.getColor());
        autorTextView.setText(cita.getAutor());
        autorTextView.setTextColor(cita.getColor());
        nuevaCitaButton.setBackgroundColor(cita.getColor());

    }

}
