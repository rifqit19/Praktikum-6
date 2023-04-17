package Latihan3.Transportasi;

public class Bicycle {

    private String merek;
    private int tahun;
    private String model;
    private String type;
    private String warna;

    public Bicycle(String merek, int tahun, String model, String type, String warna) {
        this.merek = merek;
        this.tahun = tahun;
        this.model = model;
        this.type = type;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void getInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Warna: " + warna);
    }
}
