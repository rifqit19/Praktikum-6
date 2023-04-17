package Latihan2;

import Latihan2.lib.*;
import Latihan2.test.*;

public class AksesLib {
    public static void main(String[] args) {
        MyLib m = new MyLib();
        m.cetak();

        YourLib y = new YourLib();
        y.cetak2();

        HisLib h = new HisLib();
        h.cetak3();

    }

}
