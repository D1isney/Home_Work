package _Week8;

import java.util.Scanner;

public class testClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Home_work1();
        Home_work2();
        System.out.println();
        System.out.println("此数是否回文数："+Home_work3());
    }


    public static boolean Home_work3() {
        System.out.print("请输入一个正整数：");
        Long i = sc.nextLong();
        String str = String.valueOf(i);
        int length = str.length();
        int left = 0, right = 0;
        boolean flag = true;
        //  输入数字个数为单数
        int index = length / 2;
        if (str.length() % 2 == 0) {
            while (flag) {
                left = index - 1;
                right = index;
                while (left >= 0 && right < length && str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                    if (right == length) return true;
                }
                flag = false;
            }
        }
        //  输入数字个数为单数
        else {
            while (flag) {
                left = index - 1;
                right = index + 1;
                while (left >= 0 && right < length && str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                    if (right == length) return true;
                }
                flag = false;
            }
        }
        return false;
    }
    public static void Home_work2() {
        /**
         * 0 1 无意义
         */
        System.out.print("2~999回文数：");
        for (int i = 2; i < 1000; i++) {
            boolean b = Home_work2_2(i);
            if (b) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean Home_work2_2(int i) {
        int z = i / 10 / 10 % 10;
        int k = i / 10 % 10;
        int j = i % 10;
        int v = (int) (Math.pow(z, 3) + Math.pow(k, 3) + Math.pow(j, 3));
        if (v == i) {
            return true;
        }
        return false;
    }


    public static void Home_work1() {
        System.out.print("请输入第一个数：");
        int i = sc.nextInt();
        System.out.print("请输入第二个数：");
        int j = sc.nextInt();
        if (i > 0) {
            if (j > 0) System.out.println("(" + i + "," + j + ")位于第一象限");
            else if (j < 0) System.out.println("(" + i + "," + j + ")位于第四象限");
            else System.out.println("(" + i + "," + j + ")位于x轴");
        } else if (i < 0) {
            if (j > 0) System.out.println("(" + i + "," + j + ")位于第二象限");
            else if (j < 0) System.out.println("(" + i + "," + j + ")位于第三象限");
        } else if (j == 0) System.out.println("(" + i + "," + j + ")是坐标原点");
        else System.out.println("(" + i + "," + j + ")位于y轴");
    }

    public static void test2() {
        System.out.printf("请输入任意一个数：");
        int i = sc.nextInt();
        for (int j = 1; j <= 100; j++) {
            if (j < i) {
                System.out.print(j + "\t");
            } else {
                break;
            }
            if (j % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void test1() {
        System.out.print("请输入：");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String index = String.valueOf(str.charAt(i));
            if (index.equals(" ")) {
                count++;
            }
        }
        System.out.println("空格数为：" + count);
    }
}
