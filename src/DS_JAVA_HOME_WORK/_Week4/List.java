package _Week4;

public interface List {
    //    遍历输出数组中每一个元素(5’)
    public void outPut();

    //    返回线性表的大小，即数据元素个数(5’)
    void getSIZE();

    //    返回线性表的大小，即数据元素个数(5’)
    void getLENGTH();

    //    判断是否为空（true),否则返回（false)(5’)
    boolean isListNull();

    //    返回线性表中序号为i的数据元素。(5’)
    Object indexOfElement(int i);

    //     判断线性表中是否包含元素e(5’)
    Boolean isExistElement(Object o);


    //    返回数组元素e在线性表中的位置(5’)
    Object valueOfIndex(Object o);


    //    将数据元素e插入下标为i的位置。(10’)
    void insert(int i, Object o);


    //   将数据元素e插入下标为i之前的位置，成功则返回true，否则返回false(5’)
    Boolean afterInsert(int i, Object o);

    //    将数据元素e插入下标为i之后的位置，成功则返回true，否则返回false(5’)
    Boolean beforeInsert(int i, Object o);


    //     删除线性表中下标为i的元素，并返回该元素值。(10’)
    Object delete(int i);

    //     删除线性表中第一个与e相同的元素，成功返回true。(10’)
    Boolean deleteFirstSame(Object o);

    //    替换线性表中下标为i的数据元素为e，返回原数据元素。
    Object indexOfModify(int i, Object o);

    //    扩容操作（10’）
    void expansion();

    //    缩容操作。（可根据扩容自行实现）
    void shrinkageCapacity();
}
