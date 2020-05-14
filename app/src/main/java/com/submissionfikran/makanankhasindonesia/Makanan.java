package com.submissionfikran.makanankhasindonesia;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {

    private String nama_makanan;
    private String detail_makanan;
    private String lokasi_makanan;
    private String komposisi_makanan;
    private int photo;


    protected Makanan(Parcel in) {
        nama_makanan = in.readString();
        lokasi_makanan = in.readString();
        detail_makanan = in.readString();
        komposisi_makanan = in.readString();

        photo = in.readInt();
    }

    public Makanan() {

    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }


    public String getLokasi_makanan() {
        return lokasi_makanan;
    }

    public  void setLokasi_makanan(String lokasi_makanan)  { this.lokasi_makanan = lokasi_makanan; }

    public String getKomposisi_makanan() {
        return komposisi_makanan;
    }

    public  void setKomposisi_makanan(String komposisi_makanan)  { this.komposisi_makanan = komposisi_makanan; }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public void setDetail_makanan(String detail_makanan) {
        this.detail_makanan = detail_makanan;
    }


    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_makanan);
        parcel.writeString(lokasi_makanan);
        parcel.writeString(detail_makanan);
        parcel.writeString(komposisi_makanan);
        parcel.writeInt(photo);
    }


}

