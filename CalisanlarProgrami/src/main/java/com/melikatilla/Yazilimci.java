package com.melikatilla;

public class Yazilimci extends Calisanlar{

        private String diller;

    public Yazilimci(String ad, String soyad, int id,String diller){
        super(ad,soyad,id);
        this.diller=diller;

    }

    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+" "+isletim_sistemi+" yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: "+diller);
    }

    public void setDiller(String diller){
        this.diller=diller;
    }
    public String getDiller(){
        return diller;
    }

}
