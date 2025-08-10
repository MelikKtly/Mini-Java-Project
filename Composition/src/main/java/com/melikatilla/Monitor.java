package com.melikatilla;

public class Monitor {
    private String model;
    private String boyut;
    private String uretici;
    private Resolution resolution;

    public Monitor(String model, String boyut, String uretici, Resolution resolution) {
        this.model = model;
        this.boyut = boyut;
        this.uretici = uretici;
        this.resolution = resolution;
    }

    public void monitor_kapat(){
        System.out.println("Monitor kapat... ");
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBoyut() {
        return boyut;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }


}
