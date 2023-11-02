package _Week4;

public class ArrayList implements List {
    //    定义一个默认长度
    private static int LENGTH = 4;
    //    定义一个数组对象
    private Object[] object;
    //    定义一个数组元素个数
    private static int SIZE;

    //    初始化
    public ArrayList() {
        object = new Object[LENGTH];
        SIZE = 0;
    }

    /**
     * 1
     * 打印 各个元素的的下标以及内容
     */
    @Override
    public void outPut() {
        for (int i = 0; i < object.length; i++) {
            System.out.println("index[" + i + "]：" + object[i]);
        }
    }

    /**
     * 2
     * 打印 SIZE 个数
     */
    @Override
    public void getSIZE() {
        System.out.println("SIZE：" + SIZE);
    }

    /**
     * 2
     * 打印 LENGTH 长度
     */
    public void getLENGTH() {
        System.out.println("LENGTH：" + LENGTH);
    }

    /**
     * 3
     * 无元素则返回true 否则返回false
     *
     * @return
     */
    @Override
    public boolean isListNull() {
        for (Object o : object) {
            if (o != null) return true;
        }
        return false;
    }

    /**
     * 4
     * 拿到下标 返回下表对应的元素
     *
     * @param i
     * @return
     * @Author：dandan
     */
    @Override
    public Object indexOfElement(int i) {
        if (i > object.length || i < 0) {
            System.out.println("下标越界！");
            return null;
        }
        return object[i];
    }

    /**
     * 5
     * 传入一个元素 判断列表是否有这个元素
     * 有的话返回true 否则返回false
     *
     * @param o
     * @return
     * @Author：dandan
     */
    @Override
    public Boolean isExistElement(Object o) {
        for (Object obj : object) {
            if (obj == o) return true;
        }
        return false;
    }

    /**
     * 6
     * 拿到元素 有就返回对应下标 否则返回null
     *
     * @param o
     * @return
     */
    @Override
    public Object valueOfIndex(Object o) {
        for (int i = 0; i < LENGTH; i++) {
            if (object[i] == o) return i;
        }
        return null;
    }


    /**
     * 7
     * 在第i个元素中插入元素
     *
     * @param i
     * @param o
     */
    @Override
    public void insert(int i, Object o) {
        if (crossBorder(i)) {
            expansion();
        }
        for (int j = SIZE; j > i; j--) {
            object[j] = object[j - 1];
        }
        object[i] = o;
        SIZE++;
    }

    /**
     * 9
     * 拿到需要后插的位置 以及对应的元素o
     * 在 i对应的位置 从最后一个往前循环直到 i+1
     * 从最后一个开始 往后赋值 知道 i+1
     *
     * @param i
     * @param o
     * @return
     */
    //    后继添加元素
    @Override
    public Boolean afterInsert(int i, Object o) {
        if (o == null) return false;
        SIZE++;
        //  i插入到最后一个元素位时 判断时否在list的最后一个 是的话就扩容
        if (i >= LENGTH - 1) expansion();
        for (int j = LENGTH - 1; j >= i; j--) {
            if (j == i) {
                break;
            }
            object[j] = object[j - 1];
        }
        object[i + 1] = o;
        return true;
    }

    /**
     * 8
     * 拿到需要前插元素的位置 以及 对应的元素 o
     * 在i对应的位置 从最后一个往前循环直到i
     * 从最后一个开始 往后赋值 直到 i
     *
     * @param i
     * @param o
     * @return
     */
    //    前驱添加元素
    @Override
    public Boolean beforeInsert(int i, Object o) {
        if (o == null) return false;
        SIZE++;
        //  不够位置就扩容
        if (SIZE >= LENGTH) expansion();
        for (int j = LENGTH - 1; j > i + 1; j--) {
            if (j == i) {
                break;
            }
            object[j] = object[j - 1];
        }
        object[i] = o;
        return true;
    }

    /**
     * 10
     * 拿到下标i 看是否有 有就删除对应的值
     * 否则 返回空
     *
     * @param i
     */
    //    delete
    @Override
    public Object delete(int i) {
        if (crossBorder(i)) System.out.print("越界！");
        //  后面元素往前移动
        Object old = object[i];
        for (int j = i; j < object.length; j++) {
            if (j == object.length - 1) {
                object[j] = null;
                break;
            }
            object[j] = object[j + 1];
        }
        SIZE--;
        return old;
    }

    /***
     * 11
     * 传入一个元素o 循环遍历列表 有同样的元素就删除 并返回true
     * 没有则返回false
     * @param o
     * @return
     */
    //    删除线性表中第一个与e相同的元素 成功返回true
    @Override
    public Boolean deleteFirstSame(Object o) {
        for (int i = 0; i < LENGTH; i++) {
            if (object[i] == o) {
                //  使用上面定义的删除方法
                delete(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 12
     * 拿到需要修改的下标i 以及需要替换的元素o
     *
     * @param i
     * @param o
     * @return
     */
    //    修改
    @Override
    public Object indexOfModify(int i, Object o) {
        if (crossBorder(i)) {
//            System.out.println("");
            expansion();
            Object[] old = new Object[1];
            old[0] = object[i - 1];
            object[i - 1] = o;
            return old[0];
        }
        Object[] old = new Object[1];
        old[0] = object[i - 1];
        object[i - 1] = o;
        return old[0];
//        return null;
    }


    /**
     * 13
     * 扩容 做新数组代替
     */
    //    扩容方法
    @Override
    public void expansion() {
        Object[] arr = new Object[LENGTH * 2];
        if (LENGTH >= 0) System.arraycopy(object, 0, arr, 0, LENGTH);
        object = arr;
        LENGTH *= 2;

    }

    /**
     * 缩容
     * 14
     * 从后往前循环 判断是否为空
     * 知道循环碰到最后一个元素 每有一个null 则count++ 即 往前全是数组最小长度
     * 则 做一个新数组装旧数组的最小长度
     * 重新赋值LENGTH
     */
    //  缩容
    @Override
    public void shrinkageCapacity() {
        int count = 0;
        for (int i = object.length - 1; i >= 0; i--) {
            if (object[i] == null) count++;
            if (object[i] != null) break;
        }
        int NewLENGTH = object.length - count;
        Object[] arr = new Object[NewLENGTH];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = object[i];
        }
        object = arr;
        //  初始LENGTH的大小
        LENGTH = arr.length;
    }

    /**
     * 拿到i 判断是否超越数组长度
     *
     * @param i
     * @return
     */
    //    判断越界方法
    public static boolean crossBorder(int i) {
                  return i < 0 || i >= LENGTH;
    }


}
