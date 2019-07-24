package com.example.aplikasisepeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eNama;
    private EditText eSepeda;
    private EditText eFrame;
    private EditText eJumlah;
    private Button bCetak;
    private TextView tOutputnama;
    private TextView tOutputsepeda;
    private TextView tOutputframe;
    private TextView tOutputjumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.idnama);
        eSepeda = findViewById(R.id.idsepeda);
        eFrame = findViewById(R.id.idframe);
        eJumlah = findViewById(R.id.idjumlah);
        bCetak = findViewById(R.id.idcetak);
        tOutputnama = findViewById(R.id.idoutputnama);
        tOutputsepeda = findViewById(R.id.idoutputsepeda);
        tOutputframe = findViewById(R.id.idoutputframe);
        tOutputjumlah = findViewById(R.id.idoutputjumlah);

        bCetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputNama = eNama.getText().toString();
        String inputSepeda = eSepeda.getText().toString();
        String inputFrame = eFrame.getText().toString();
        String inputJumlah = eJumlah.getText().toString();

        if (inputNama.length() == 0) {
            eNama.setError("Data tidak boleh kosong");
        } else {
            tOutputnama.setText(inputNama);
        }
        if (inputSepeda.length() == 0) {
            eSepeda.setError("Data tidak boleh kosong");
        } else {
            tOutputsepeda.setText(inputSepeda);
        }
        if (inputFrame.length() == 0) {
            eFrame.setError("Data tidak boleh kosong");
        } else {
            tOutputframe.setText(inputFrame);
        }
        if (inputJumlah.length() == 0) {
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputjumlah.setText(inputJumlah);
        }
    }
}