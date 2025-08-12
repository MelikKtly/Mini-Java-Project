package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade Prograpına hoşgeldiniz...");
        System.out.println("Çıkış için q ya basınız");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            } else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeUret(islem);

                if(beyblade==null){
                    System.out.println("Lütfen geçerli beyblade ismi giriniz");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarCikar();
                }

            }
        }
    }
}