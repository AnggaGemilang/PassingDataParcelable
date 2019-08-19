package com.example.passingobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TampilData extends AppCompatActivity {

    public static String EXTRA_DATA = "extra_data";
    public TextView nama, alamat, pesanan;
    public Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        nama = (TextView) findViewById(R.id.nama);
        alamat = (TextView) findViewById(R.id.alamat);
        pesanan = (TextView) findViewById(R.id.pesanan);

        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilData.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Data data = getIntent().getParcelableExtra(EXTRA_DATA);

        nama.setText("Tn/Ny " + data.getNama());
        alamat.setText("Di " + data.getAlamat());
        pesanan.setText("Memesan " + data.getPesanan());
    }
}
