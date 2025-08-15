package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap=new Hesap("Melik","12345",2000);
        System.out.println("Hesap sifre:"+hesap.getParola());
        atm.calis(hesap);
        System.out.println("Sistemden çıkılıyor");




    }
}