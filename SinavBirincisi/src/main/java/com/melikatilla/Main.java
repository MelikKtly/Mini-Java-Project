package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler="İşlemler...\n"+
                        "1. Eşit ağırlık öğrencileri birincisi\n"+
                        "2. Sayısal öğrencileri birincisi\n";

        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");

        while(true){
            System.out.println("Çıkış için q ya bas");
            String cevap=scanner.nextLine();
            if(cevap.equals("q")){
                break;
            }
            System.out.println("Birinci öğrenci ismi");
            String isim1 = scanner.nextLine();
            System.out.println("Netleri giriniz(Türkçe Matematik Edebiyat Fizik)");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("İkinci öğrenci ismi");
            String isim2 = scanner.nextLine();
            System.out.println("Netleri giriniz(Türkçe Matematik Edebiyat Fizik)");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Üçüncü öğrenci ismi");
            String isim3 = scanner.nextLine();
            System.out.println("Netleri giriniz(Türkçe Matematik Edebiyat Fizik)");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("İşlemi giriniz");
            String islem = scanner.nextLine();
             if (islem.equals("1")) {
                EsitAgirlik ogr1=new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1,isim1);
                EsitAgirlik ogr2=new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2,isim2);
                EsitAgirlik ogr3=new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3,isim3);

                EsitAgirlik birinci=birinci(ogr1,ogr2,ogr3);
                System.out.println("Birinci eşit ağırlık öğrencisi : "+birinci.getIsim());
                System.out.println("Öğrencinin puanı : "+birinci.puanHesapla());

            }
            else if (islem.equals("2")) {
                Sayisal ogr1=new Sayisal(turkce1,matematik1,edebiyat1,fizik1,isim1);
                Sayisal ogr2=new Sayisal(turkce2,matematik2,edebiyat2,fizik2,isim2);
                Sayisal ogr3=new Sayisal(turkce3,matematik3,edebiyat3,fizik3,isim3);

                Sayisal birinci=birinci(ogr1,ogr2,ogr3);
                System.out.println("Birinci sayısal öğrencisi : "+birinci.getIsim());
                System.out.println("Öğrencinin puanı : "+birinci.puanHesapla());
            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla()>e2.puanHesapla()&& e1.puanHesapla()>e3.puanHesapla()){
            return e1;
        }
       else if(e2.puanHesapla()>e1.puanHesapla()&& e2.puanHesapla()>e3.puanHesapla()){
            return e2;
        }
       else if (e3.puanHesapla()>e1.puanHesapla()&& e3.puanHesapla()>e2.puanHesapla()){
           return e3;
        }
       return e1=e2=e3;
    }
}