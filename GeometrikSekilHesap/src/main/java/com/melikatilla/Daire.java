package com.melikatilla;

public class Daire extends Sekil{
    private int r;

    public Daire(String isim,int r){
        super(isim);
        this.r=r;
    }
    @Override
    public void alanHesapla() {
        double alan=(Math.PI*(r*r));
        System.out.println(getIsim()+" ın alanı : "+alan);
    }
}
