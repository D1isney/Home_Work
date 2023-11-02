package _Week4;

public class demoTest {
    public static void main(String[] args) {
        int i = 3;
        ArrayList arrayList = new ArrayList();
        System.out.println("对应线性表是否为空：" + arrayList.isListNull());
        arrayList.insert(0, 0);
        arrayList.insert(1, 1);
        arrayList.insert(2, 2);
        arrayList.insert(3, 3);
        arrayList.insert(4, 4);
//        前驱插入一个元素
        arrayList.beforeInsert(5, 9);
//        后继插入一个元素
        arrayList.afterInsert(5, 20);

        arrayList.outPut(); // 1 遍历
        arrayList.getSIZE();
        arrayList.getLENGTH();
        for (int j = 0; j < i * 7; j++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("对应下标" + i + "的元素为：" + arrayList.indexOfElement(i));
//        删除对应下表元素
//        0 1 2 3 -> 0
        System.out.println("index = 0,删除的元素为：" + arrayList.delete(0));
//        1 2 3 -> 2
        System.out.println("index = 1,删除的元素为：" + arrayList.delete(1));
//        1 3 -> null
        System.out.println("index = 2,删除的元素为：" + arrayList.delete(2));
//        1 3 -> null
        System.out.println("index = 3,删除的元素为：" + arrayList.delete(3));
//        检查是否存在某个元素
        System.out.println("是否存在" + i + "这个元素：" + arrayList.isExistElement(i));
        //
        System.out.println("元素" + i + "对应的下标位置：" + arrayList.valueOfIndex(i));
//        删除第一个相同的元素
        System.out.println("删除第一个与" + i + "相同的元素(成功返回true，失败则返回false)：" + arrayList.deleteFirstSame(i));
        System.out.println("修改下标为"+i+"前为：" + arrayList.indexOfModify(i, i) + "，修改后为：" + i);

        arrayList.shrinkageCapacity(); // 14 缩容
        arrayList.outPut(); // 1 遍历
        arrayList.getSIZE();
        arrayList.getLENGTH();
    }
}
