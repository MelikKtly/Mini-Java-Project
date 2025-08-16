package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler="İşlemler...\n"+
                        "1.Kare alanı hesapla\n"+
                        "2.Üçgen alanı hesapla\n"+
                        "3.Daire alanı hesapla\n"+
                        "Çıkış için q ya bas";

        while(true){
            System.out.println(islemler);
            System.out.println("Hangi işlemi yapmak istersiniz");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Lütfen karenin kenarını giriniz");
                double kenar = scanner.nextDouble();
                scanner.nextLine();

                Kare kare=new Kare("Kare",kenar);
                kare.alanHesapla();
                System.out.println("*******************************");
            }
            else if(islem.equals("2")){
                System.out.println("Lütfen üçgenin kenarlarını giriniz");
                System.out.println("1. kenarı giriniz");
                int a=scanner.nextInt();
                System.out.println("2. kenarı giriniz");
                int b=scanner.nextInt();
                System.out.println("3. kenarı giriniz");
                int c=scanner.nextInt();
                scanner.nextLine();

                Ucgen ucgen=new Ucgen("Ucgen",a,b,c);
                ucgen.alanHesapla();
                System.out.println("*******************************");

            }
            else if(islem.equals("3")){
                System.out.println("Lütfen dairenin yarıçapını giriniz");
                int r=scanner.nextInt();
                scanner.nextLine();

                Daire daire=new Daire("Daire",r)
                        ;
                daire.alanHesapla();
                System.out.println("*******************************");

            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
