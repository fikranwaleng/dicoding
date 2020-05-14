package com.submissionfikran.makanankhasindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMakanan extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvLokasi = findViewById(R.id.tv_item_lokasi);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvKomposisi = findViewById(R.id.tv_item_komposisi);


        Makanan makanan = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (makanan != null) {
            Glide.with(this)
                    .load(makanan.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(makanan.getNama_makanan());
            tvLokasi.setText(makanan.getLokasi_makanan());
            tvDeskripsi.setText(makanan.getDetail_makanan());
            tvKomposisi.setText(makanan.getKomposisi_makanan());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Makanan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
