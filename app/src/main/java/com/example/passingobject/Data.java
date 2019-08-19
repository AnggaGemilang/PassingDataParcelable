package com.example.passingobject;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

public class Data implements Parcelable {

    private String nama, alamat, pesanan;

    public Data(String nama, String alamat, String pesanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.pesanan = pesanan;
    }

    public Data(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.pesanan);
    }

    protected Data(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.pesanan = in.readString();
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}