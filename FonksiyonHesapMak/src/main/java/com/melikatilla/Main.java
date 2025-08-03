package com.melikatilla;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int toplama(int a,int b){
        return a+b;
    }

    public static int cikarma(int a,int b){
        return a-b;
    }

    public static int carpma(int a,int b){
        return a*b;
    }
    public static int bolme(int a,int b){
        return a/b;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz ");
        System.out.println("1-Toplama\n,2-Cikarma\n,3-Carpma\n,4-Bolme,5-Cıkıs");
        int secenek=sc.nextInt();

                switch (secenek) {
                    case 1:
                        System.out.println("Lütfen iki sayi giriniz");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println(toplama(a, b));
                        break;
                    case 2:
                        System.out.println("Lütfen iki sayi giriniz");
                        int c = sc.nextInt();
                        int d = sc.nextInt();
                        System.out.println(cikarma(c, d));
                        break;
                    case 3:
                        System.out.println("Lütfen iki sayi giriniz");
                        int e = sc.nextInt();
                        int f = sc.nextInt();
                        System.out.println(carpma(e, f));
                        break;
                    case 4:
                        System.out.println("Lütfen iki sayi giriniz");
                        int h = sc.nextInt();
                        int g = sc.nextInt();
                        System.out.println(bolme(h, g));
                        break;
                    default:
                        System.out.println("Geçersiz giriş");
                }

            }
        }
