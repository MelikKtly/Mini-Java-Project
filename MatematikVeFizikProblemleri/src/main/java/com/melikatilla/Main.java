package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz");

        String islemler="İşlemler...\n"+
                "**********************\n"+
                "1. Daire alanı hesaplama\n"+
                "2. Üçgen çevresi hesaplama\n"+
                "3. 2 vektörün iç çarpımını hesaplama"+
                "Çıkış için q ya basınız";

        while (true){
            System.out.println(islemler);
            System.out.println("**********************");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("Dairenin yarıçapı: ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")) {
                System.out.println("Lütfen üçgenin kenarlarını giriniz...");
                System.out.print("Kenar 1: ");
                int kenar1=scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kenar 2: ");
                int kenar2=scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kenar 3: ");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1,kenar2,kenar3);
            }
            else if (islem.equals("3")) {
                Vec vec1=new Vec("Vektör 1");
                Vec vec2=new Vec("Vektör 2");
                Problem.Fizik.icCarpim(vec1,vec2);
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}