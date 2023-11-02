package _Week2;

import _Week2.comput.Computing;

public class MainInterface {
    public static void main(String[] args) {

        Computing c1 = new Computing(8, 3);
        Computing c2 = new Computing(3, 1);
        Computing add = c1.add(c1, c2);
        System.out.println(add.real() + " + " + add.imaginary() + "i");
    }
}
