package com.trigoo.trigoo.Entity;

public class Booking {
    private int booking_id;
    private String hava_resim;
    private String profil_resim;
    private String farmer_isim;
    private String booking_detay;
    private float hava_derece;
    private String hava_durumu;
    private String hava_durumu_detay;

    public Booking(int booking_id, String hava_resim, String profil_resim, String farmer_isim, String booking_detay, float hava_derece, String hava_durumu, String hava_durumu_detay) {
        this.booking_id = booking_id;
        this.hava_resim = hava_resim;
        this.profil_resim = profil_resim;
        this.farmer_isim = farmer_isim;
        this.booking_detay = booking_detay;
        this.hava_derece = hava_derece;
        this.hava_durumu = hava_durumu;
        this.hava_durumu_detay = hava_durumu_detay;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getHava_resim() {
        return hava_resim;
    }

    public void setHava_resim(String hava_resim) {
        this.hava_resim = hava_resim;
    }

    public String getProfil_resim() {
        return profil_resim;
    }

    public void setProfil_resim(String profil_resim) {
        this.profil_resim = profil_resim;
    }

    public String getFarmer_isim() {
        return farmer_isim;
    }

    public void setFarmer_isim(String farmer_isim) {
        this.farmer_isim = farmer_isim;
    }

    public String getBooking_detay() {
        return booking_detay;
    }

    public void setBooking_detay(String booking_detay) {
        this.booking_detay = booking_detay;
    }

    public float getHava_derece() {
        return hava_derece;
    }

    public void setHava_derece(float hava_derece) {
        this.hava_derece = hava_derece;
    }

    public String getHava_durumu() {
        return hava_durumu;
    }

    public void setHava_durumu(String hava_durumu) {
        this.hava_durumu = hava_durumu;
    }

    public String getHava_durumu_detay() {
        return hava_durumu_detay;
    }

    public void setHava_durumu_detay(String hava_durumu_detay) {
        this.hava_durumu_detay = hava_durumu_detay;
    }
}
