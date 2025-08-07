package com.melikatilla;

public class Calisanlar {
    private String ad;
    private String soyad;
    private int id;

    public Calisanlar(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public void  setAd(String ad) {
        this.ad = ad;
    }
    public String getAd() {
        return ad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void bilgileriGoster() {
        System.out.println("Çalışan bilgileri...");
        System.out.println("Ad:"+ad);
        System.out.println("Soyad:"+soyad);
        System.out.println("ID:"+id);
    }

}
