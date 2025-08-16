package com.melikatilla;

public class Kare extends Sekil{
    private double kenar;

    public Kare(String isim,double kenar){
        super(isim);
        this.kenar=kenar;
    }

    @Override
    public void alanHesapla() {
       System.out.println(getIsim()+" in alanı : "+(kenar*kenar));
    }
}
