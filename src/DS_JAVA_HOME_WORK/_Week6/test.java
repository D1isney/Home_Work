package _Week6;

public class test {
    public static void main(String[] args) {
        List list = new List();
        list._Text("插入");
        list.addNode(new Node("张三", "男", 1));
        list.addNode(new Node("李四", "女", 2));
        list.addNode(new Node("王四", "男", 3));
        list.addNode(new Node("赵六", "女", 4));
        list.outPut();

        list._Text("添加");
        list.insertNode(1, new Node("王五", "男", 3));
        list.outPut();

        list._Text("删除");
        list.deleteNode(1);
        list.outPut();

        list._Text("更新");
        list.Update_point(1, "", "");
        list.outPut();

        list._Text("查询");
        System.out.println(list.Check_Node(1).toString());

        list._Text("反转");
        list.reverList();
        list.outPut();

//        for (int i = 0; i <30 ; i++) {
//            System.out.print("-");
//        }
//        System.out.println();
//        BothWayList bothWayList = new BothWayList();
//        bothWayList.addBothWayNode(new BothWayNode("张三","男",1));
//        bothWayList.addBothWayNode(new BothWayNode("李四","女",2));
//        bothWayList.addBothWayNode(new BothWayNode("王五","男",3));
//        bothWayList.outPut();
    }
}
