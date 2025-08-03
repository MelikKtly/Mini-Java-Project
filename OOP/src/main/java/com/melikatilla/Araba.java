package com.melikatilla;

public class Araba {

    private int tekerlek;
    private String model;
    private String renk;
    private int kapı;

    public void setTekerlek(int tekerlek){
        this.tekerlek=tekerlek;
    }

    public int getTekerlek(){
        return this.tekerlek;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public void setRenk(String renk){
        this.renk=renk;
    }

    public String getRenk(){
        return renk;
    }

    public void setKapı(int kapı){
        if (kapı<0)
            System.out.println("Kapı 0 dan küçük olamaz");
        else
            this.kapı=kapı;
    }
    public int getKapı(){
        return kapı;
    }

}
