package Latihan3;

import Latihan3.Transportasi.Bicycle;
import Latihan3.Transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Honda", 2013, "GT-86", "Bensin", "Hitam");
        System.out.println("Informasi Mobil:");
        mobil.getInfo();
        System.out.println();

        Bicycle bicycle = new Bicycle("Brompton", 2020, "C Line Urban", "Foldable", "Titanium Green");
        System.out.println("Informasi Bicycle:");
        bicycle.getInfo();
        System.out.println();
    }

}
