package com.melikatilla;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Resolution resolution=new Resolution("1920","1080");
        Monitor monitor=new Monitor("Shadow blade","18.5","Asus",resolution);
        Kasa kasa=new Kasa("Shadow Blade","Shadow","Temperli cam");
        Anakart anakart=new Anakart("B250","ASUS",10,"Windows");

        Bilgisayar pc=new Bilgisayar(kasa,monitor,anakart);
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitor_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu");
    }
}