package com.melikatilla;

import java.util.ArrayList;
import java.util.Scanner;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilariBastir(){
        System.out.println("Şarkıcılar listesinde "+sarkici_listesi.size()+" kadar şarkıcı var.");

        for(int i=0;i<sarkici_listesi.size();i++){
            System.out.println((i+1)+". şarkıcı "+sarkici_listesi.get(i));
        }
    }

    public void sarkiciEkle(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Lütfen eklemek istediğiniz şarkıcıların ismini yazınız.(çıkmak için q ya basınız)");
            String isim_ekle = scanner.nextLine();
            if (isim_ekle.equalsIgnoreCase("q")){
                break;
            }
            else {
                sarkici_listesi.add(isim_ekle);
                System.out.println("Eklenilen isim: "+sarkici_listesi);
            }
        }
    }

    public void sarkiciGuncelle(String yeni_isim,int pozisyon){
        sarkici_listesi.set(pozisyon,yeni_isim);
        System.out.println("Şarkıcı listesi güncellendi...");
    }

    public void sarkiciSil(int pozisyon){
       String isim=sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim+" adlı şarkıcı listeden silindi.");
    }

    public void sarkiciAra(String isim){
        int pozisyon=sarkici_listesi.indexOf(isim);
        if(pozisyon>=0){
            System.out.println("Şarkıcı bulundu...");
            System.out.println(isim+" adlı şarkıcı "+(pozisyon+1)+" sırasında...");
        }
        else{
            System.out.println(isim+" adında bir şarkıcı bulunmuyor...");
        }

    }

}
