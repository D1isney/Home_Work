import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/**        System.out.print("请输入您的性别：");
 String sex = sc.nextLine();
 if (Objects.equals(sex, "男") || Objects.equals(sex, "女")) {
 System.out.println("您的性别为：" + sex);
 } else
 System.out.println("输入格式错误！");

 System.out.print("请输入圆的半径r：");
 float r = sc.nextFloat();
 if (r < 0) System.out.println("输入园的半径值必须大于0");
 else {
 float S = (float) (Math.pow(r, 2) * Math.PI);
 System.out.println("圆的面S：" + S);
 }
 */

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(19);
//        arrayList.set(1,"10");
        Collections.sort(arrayList);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int[] arr = {1,7};
        arrayList1.add(1);
        arrayList1.add(7);
        boolean b = arrayList.removeAll(arrayList1);
        System.out.println(arrayList);


    }

}
