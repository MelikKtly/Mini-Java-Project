package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ÇALISANLAR PROGRAMINA HOSGELDINIZ");
        String islemler="İşlemler...\n"+
                        "1.Yazılımcı işlemleri\n"+
                        "2.Yönetici işlemleri\n"+
                        "Çıkış için q ya basınız";
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");

        while(true){
            System.out.print("İşlem seçiniz");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("İşlemden çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci=new Yazilimci("Melik","Atilla",1,"Java");
                String yazilimci_islem="1. Format at\n"+
                        "2. Bilgileri Göster\n"+
                        "Çıkış için q ya basın";
                System.out.println(yazilimci_islem);

                while (true){
                    String islem1=scanner.nextLine();
                    if (islem1.equals("q")){
                        System.out.println("Yazılımcı işleminden çıkılıyor");
                        break;
                    } else if (islem1.equals("1")) {
                        System.out.print("İşletim sistemi: ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (islem1.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yazilimci işlemi...");
                    }
                }
            }
            else if(islem.equals("2")){
                Yönetici yönetici= new Yönetici("Kutlay","Atilla",2,100);
                String yönetici_islem="Yönetici işlemleri\n"+
                                        "1. Zam yap\n"+
                                        "2. Bilgileri göster\n"+
                                        "Çıkış için q ya bas";
                System.out.println(yönetici_islem);
                while (true){
                    System.out.println("İşlem seçiniz");
                    String islem2=scanner.nextLine();
                    if (islem2.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor");
                        break;
                    }
                    else if (islem2.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari=scanner.nextInt();
                        scanner.nextLine();
                        yönetici.zamYap(zamMiktari);
                    }
                    else if (islem2.equals("2")){
                        yönetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yönetici işlemi... ");
                    }
                }
            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
}