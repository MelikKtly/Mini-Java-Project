package com.melikatilla;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap=new Hesap("Melik","12345",2000);
        atm.calis(hesap);
        System.out.println("Sistemden çıkılıyor");

    }
}