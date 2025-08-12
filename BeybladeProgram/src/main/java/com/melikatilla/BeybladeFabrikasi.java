package com.melikatilla;

public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beyblade_turu) {
        if (beyblade_turu.equals("Dragon")) {
            return new Dragon("Takao", 800, 900, "Mavi Ejderha", "Kutsal canavarla konuş");
        }
        else if (beyblade_turu.equals("Dranza")) {
            return new Dranza("Kai",600,500,"Kırmızı Anka Kuşu");
        }
        else if (beyblade_turu.equals("Drayga")) {
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }
        else if (beyblade_turu.equals("Draciel")) {
            return new Draciel("Max",400,1000,"Kara Kaplumbağa");
        }
        else {
            return null;
        }
    }
}
