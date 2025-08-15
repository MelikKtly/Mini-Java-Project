package com.melikatilla;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Antalya havalimanına hoşgeldiniz...");

        String sartlar= "Yurt dışı çıkış kuralları\n"+
                        "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"+
                        "750 TL harç bedelini tam olarak yatırmanız gerekiyor...\n"+
                        "Gideceğiniz ülke için vizenizin bulunması gerekiyor...\n";

        String message="Şartların hepsini sağlamanız gerekiyor";

            while (true){
                System.out.println("*************************");
                System.out.println(sartlar);
                System.out.println("*************************");


                Yolcu yolcu = new Yolcu();

                System.out.println("Harç bedeli kontrol ediliyor...");
                Thread.sleep(3000);
                if (yolcu.yurtDisiHarciKontrol()==false){
                    System.out.println(message);
                    continue;
                }

                System.out.println("Siyasi yasak kontrol ediliyor...");
                Thread.sleep(3000);
                if (yolcu.siyasiYasakKontrol()==false){
                    System.out.println(message);
                    continue;
                }


                System.out.println("Vize kontrol ediliyor...");

                Thread.sleep(3000);
                if (yolcu.vizeDurumuKontrol()==false){
                    System.out.println(message);
                    continue;
                }

                System.out.println("İşlemler tamam.İyi yolculuklar...");

                break;





            }


    }
}