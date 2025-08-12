package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void ara(){
        System.out.println("Hangi şarkıcıyı aramak istersiniz?");
        String isim_aramak = scanner.nextLine();
        sarkicilar.sarkiciAra(isim_aramak);

    }
    public static void sarkici_Sil(){
        System.out.println("Hangi şarkıcıyı silmek istersiniz?(1,2,3...)");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        sarkicilar.sarkiciSil(pozisyon-1);

    }
    public static void güncelle(){
        System.out.println("Hangi pozisyonu güncellemek istersiniz?(1,2,3...)");
        int pozisyonu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni şarkıcının ismi nedir?");
        String isim=scanner.nextLine();

        sarkicilar.sarkiciGuncelle(isim,pozisyonu-1);

    }

    public static void islemleriBastir(){
        System.out.println("****************************");
        System.out.println("0-İşlemleri Görüntüle");
        System.out.println("1-Şarkıcıları Görüntüle");
        System.out.println("2-Şarkıcı Ekle");
        System.out.println("3-Şarkıcı Güncelle");
        System.out.println("4-Şarkıcı Sil");
        System.out.println("5-Şarkıcı Ara");
        System.out.println("6-Uygulamadan Çık");
        System.out.println("****************************");


    }

    public static void main(String[] args) {

        System.out.println("Şarkıcılar uygulamasına hoşgeldiniz");
        islemleriBastir();

        while (true){
            System.out.println("Lütfen istediğiniz işlemi seçiniz");
            int islem=scanner.nextInt();
            scanner.nextLine();

            if(islem==0){
                islemleriBastir();
            }
            else if(islem==1){
                sarkicilar.sarkicilariBastir();
            }
            else if(islem==2){
                sarkicilar.sarkiciEkle();
            }
            else if(islem==3){
                güncelle();
            }
            else if(islem==4){
                sarkici_Sil();
            }
            else if(islem==5){
                ara();
            }
            else{
                break;
            }
        }


    }
}