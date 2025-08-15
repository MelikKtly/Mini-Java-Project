package com.melikatilla;

// Yolcu class oluştur private harc,boolean siyasiDurum vizeDurum

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiDurum;
    private boolean vizeDurum;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli : ");
        this.harc =scanner.nextInt();
        scanner.nextLine();

        System.out.println("Herhangi bir siyasi yasağınız var mı? (evet/hayır) ");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")) {
            this.siyasiDurum = true;
        }
        else {
            this.siyasiDurum = false;
        }
        System.out.println("Vize aldınız mı? (evet/hayır)");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.vizeDurum = true;
        }
        else {
            this.vizeDurum = false;
        }


    }

    @Override
    public boolean yurtDisiHarciKontrol() {
            if (this.harc <750){
                System.out.println("Lütfen yurt dışı çıkış harcını tam yatırın");
                return false;
            }
            else {
                System.out.println("Harc islemi tamam!");
                return true;
            }

    }

    @Override
    public boolean siyasiYasakKontrol() {
            if (this.siyasiDurum) {
                System.out.println("Siyasi yasağınız bulunmakta.");
                return false;
            }
            else {
                System.out.println("Siyasi yasağınız bulunmamakta.");
                return true;
            }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurum) {
            System.out.println("Vize işlemleri tamam!");
            return true;
        }
        else {
            System.out.println("Lütfen vize işlemlerini tamamlayınız");
            return false;
        }
    }
}
