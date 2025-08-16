package com.melikatilla;

public class Ucgen extends Sekil {
    private double a;
    private double b;
    private double c;

    public Ucgen(String isim,double a, double b, double c) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void alanHesapla() {
        double s=(a+b+c)/2.0;
        double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(getIsim()+" in alanı : "+alan);

    }
}
