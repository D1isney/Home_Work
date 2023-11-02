package _Week6;

public class BothWayList {
    BothWayNode head;
    BothWayNode tail;

    public BothWayList() {
        head = new BothWayNode("","",null);
        tail = head;
    }


    public void addBothWayNode(BothWayNode bothWayNode){
        if(bothWayNode == null) return;
        tail.next = bothWayNode;
        tail.pre = bothWayNode;
        tail = tail.next;
    }

    public void outPut(){
        BothWayNode bothWayNode = head.next;
        while (bothWayNode!=null){
            System.out.println(bothWayNode.toString());
            bothWayNode = bothWayNode.next;
        }
    }

}
