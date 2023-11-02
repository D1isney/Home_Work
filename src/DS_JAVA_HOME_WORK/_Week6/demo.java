package _Week6;

public class demo {
    public static void main(String[] args) {
        List list = new List();
        Node node = new Node("","",0);
        list.addNode(node);
        list.addNode(new Node("张三","男",1));
//        list.addNode(new Node("李四","女",2));
        list.insertNode(1,node);
        list.outPut();
    }
}
