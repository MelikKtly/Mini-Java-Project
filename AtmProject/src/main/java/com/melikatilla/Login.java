package com.melikatilla;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.println("Kullanıcı adı ");
        kullanici_adi=scanner.nextLine();

        System.out.println("Parolanız: ");
        parola=scanner.nextLine();

        if (kullanici_adi.equals(hesap.getKullanici_adi()) && parola.equals(hesap.getParola())){
            return true;
        }
        else {
            return false;
        }

    }
}
