package Latihan3.Transportasi;

public class Mobil {

    private String merek;
    private int tahun;
    private String model;
    private String jenisBBM;
    private String warna;

    public Mobil(String merek, int tahun, String model, String jenisBBM, String warna) {
        this.merek = merek;
        this.tahun = tahun;
        this.model = model;
        this.jenisBBM = jenisBBM;
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

    public String getJenisBBM() {
        return jenisBBM;
    }

    public void setJenisBBM(String jenisBBM) {
        this.jenisBBM = jenisBBM;
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
        System.out.println("Jenis BBM: " + jenisBBM);
        System.out.println("Warna: " + warna);
    }
}
