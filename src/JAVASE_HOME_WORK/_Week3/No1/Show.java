package _Week3.No1;

public class Show {
    public static void show(int l){
        char arr[][] = new char[l][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new char[2 * i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '*';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < 2 * l - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
