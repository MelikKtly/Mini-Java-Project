package com.melikatilla;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("******************************");
        int giris_hakki=3;
        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else {
                System.out.println("Giriş başarısız...");
                giris_hakki--;
                System.out.println(giris_hakki+"giris hakkınız kaldı.");
            }

            if (giris_hakki==0){
                System.out.println("Giris hakkınız bitmiştir...");
                return;
            }
        }
        System.out.println("***********************");
        String islemler="1. Bakiye Görüntüleme \n," +
                        "2. Para Yatırma\n"+
                        "3. Para Çekme\n"+
                        "Çıkış için q ya basınız";

        System.out.println(islemler);
        System.out.println("***************************");
        while (true){
            System.out.println("İşlemi seçiniz");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                hesap.getBakiye();
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Ne kadar para yatırmak istiyorsunuz");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Ne kadar para cekmek istiyorsunuz");
                    int tutar=scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraCek(tutar);
                }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }

    }
}
