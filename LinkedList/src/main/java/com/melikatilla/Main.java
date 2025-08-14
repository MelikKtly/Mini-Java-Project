package com.melikatilla;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void islemleri_bastir(){
        System.out.println("0-İşlemleri bastir");
        System.out.println("1-İleri git");
        System.out.println("2-Geri git");
        System.out.println("3-Çıkış yap");
    }

    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();
        Scanner scanner = new Scanner(System.in);
        islemleri_bastir();

        boolean cikis= false;
        boolean ileri = true;

        while (!cikis){
            System.out.println("Yapmak istediğiniz işlemi seçiniz...");
            int islem=scanner.nextInt();
            scanner.nextLine();
            switch (islem){
                case 0:
                   islemleri_bastir();
                   break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehre gidiliyor: "+iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor: "+iterator.previous());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri = false;
                    }
                    break;
                case 3:
                    System.out.println("Uygulamadan çıkılıyor...");
                    cikis= true;
            }
        }


    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Antalya");
        sehirler.add("İstanbul");

        sehirleri_turla(sehirler);

    }
}