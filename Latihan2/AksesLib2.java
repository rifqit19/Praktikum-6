package Latihan2;

import Latihan2.lib.MyLib;
import Latihan2.lib.YourLib;
import Latihan2.test.*;

public class AksesLib2 {

    public static void main(String[] args) {

        MyLib m = new MyLib();
        m.cetak();

        YourLib y = new YourLib();
        y.cetak2();

        HisLib h = new HisLib();
        h.cetak3();

    }
}
