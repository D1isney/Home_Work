package _Week2.comput;


import _Week2.testInterface.TestInterFace;

public class Computing implements TestInterFace {
    private int real;
    private int imaginary;

    public Computing(int real, int imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }


    @Override
    public int real() {
        return this.real;
    }

    @Override
    public int imaginary() {
        return this.imaginary;
    }

    @Override
    public Computing add(Computing c1, Computing c2) {
        //  空对象
        if (c1 == null || c2 == null) return null;
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
        Computing computing = new Computing(this.real, this.imaginary);
        return computing;
    }
}
