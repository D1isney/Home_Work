package _Week4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int x = 45;
        long i = 542L;
        float y = 3.14f;
        double z = 3.1415;
        boolean t = true;
        char c = '8';
        double s = 1.5D;
        String n = "1";
//        课堂练习2
        double i1 = HaiLun(7.0, 8.0, 9.0);
        System.out.println("三角形面积为：" + i1);
//        课堂练习3
        rectangle();
    }

    //    ClassTest2
//    已知三角形的三条边分别为7,8,9，请根据以下公式计算出
//    三角形的面积并输出。
    public static double HaiLun(double x, double y, double z) {
        double p = (x + y + z) / 2.0;
//        double YuP = (x+y+z)%2;
        double a = p - x;
        double b = p - y;
        double c = p - z;
        double S2 = p * a * b * c;
//        double sqrt = Math.sqrt(S2);
        return Math.sqrt(S2);
    }


    //    ClassTest3
    //从键盘输入任意长方形的长和宽，计算出该长方形的面积及周长，输出结果到屏幕（保留小数点后两位）。
    public static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长(cm)：");
        double x = sc.nextDouble();
        System.out.print("请输入宽(cm)：");
        double y = sc.nextDouble();
//        计算周长
        double C = x + y;
        System.out.println("周长为：" + C + "cm");
        double S = x * y;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String format = df.format(S);
        double S02 = Double.parseDouble(format);
        System.out.println("面积为：" + S02 + "cm^2");
//        return 0;
    }


}
