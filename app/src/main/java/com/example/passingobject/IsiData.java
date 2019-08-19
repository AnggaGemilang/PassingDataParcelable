package com.example.passingobject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IsiData extends AppCompatActivity {

    EditText nama, alamat, pesanan;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data);

        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
        pesanan = (EditText) findViewById(R.id.pesanan);

        kirim = (Button) findViewById(R.id.kirim);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data data = new Data(nama.getText().toString(), alamat.getText().toString(), pesanan.getText().toString());
                Intent intent = new Intent(IsiData.this, TampilData.class);
                intent.putExtra(TampilData.EXTRA_DATA, data);
                startActivity(intent);
            }
        });

    }
}
