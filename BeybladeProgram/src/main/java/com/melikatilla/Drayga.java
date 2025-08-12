package com.melikatilla;

public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String beybladeci, int saldiriGucu, int donusHizi, String kutsalCanavar) {
        super(beybladeci,donusHizi,saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
    }

    @Override
    public void kutsalCanavarCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ı ortaya çıkıyor...");
        System.out.println(getBeybladeci()+" ın Saldırısı : kaplan pençesi ");
    }
}
