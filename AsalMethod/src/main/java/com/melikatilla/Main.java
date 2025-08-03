package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Boolean asalmi(int sayi){
        int i=2;
        for(i=2;i<sayi;i++){
            if (sayi%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hangi sayiya kadar asal sayilar bulunsun");
        int a=scanner.nextInt();

            for (int i=2;i<a;i++){
                if (asalmi(i)){
                    System.out.println(i);
                }
            }
    }
}