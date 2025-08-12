package com.melikatilla;

public class Dranza extends Beyblade{
    private String kutsalCanavar;

    public  Dranza(String beybladeci,int saldiriGucu,int donusHizi,String kutsalCanavar) {
        super(beybladeci,donusHizi,saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkıyor...");
        System.out.println(getBeybladeci()+" ın Saldırısı : alev kılıcı ");
    }
}
