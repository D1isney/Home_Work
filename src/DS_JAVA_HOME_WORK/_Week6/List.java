package _Week6;

public class List {
    Node head;
    Node tail;

    public List() {
        head = new Node("", "", null);
        tail = head;
    }

    public void addNode(Node node) {
        if (node == null) return;
        tail.next = node;
        tail = tail.next;
    }

    public void outPut() {
        Node node = head.next;
        while (node != null) {
            System.out.println(node.toString());
            node = node.next;
        }
    }

    public void insertNode(int i, Node node) {
        if (node == null) return;
        Node node1 = head;
        Node node2 = head.next;
        int pos = 1;
        while (node2 != null) {
            if (pos == i) {
                node1.next = node;
                node.next = node2;
            }
            node1 = node2;
            node2 = node2.next;
            pos++;
        }
    }

    public void deleteNode(int i) {
        Node node1 = head;
        Node node2 = head.next;
        int pos = 1;
        while (node2 != null) {
            if (pos == i) {
                node1.next = node2.next;
                node2 = null;
                return;
            }
            node1 = node2;
            node2 = node2.next;
            pos++;
        }
    }

    public boolean Update_point(Integer i, String Name, String Sex) {
        if (i == null) {
            return false;
        }
        Node node = head.next;
        int pos = 1;
        while (node != null) {
            if (pos == i) {
                node.setName(Name);
                node.setSex(Sex);
                return true;
            }
            pos++;
            node = node.next;
        }
        return false;
    }

    public Node Check_Node(Integer id) {
        if (id == null) return null;
        int pos = 1;
        Node node = head.next;
        while (node != null) {
            if (id == pos) {
                return node;
            }
            node = node.next;
            pos++;
        }
        return null;
    }

    public void _Text(String method) {
        System.out.println();
        for (int i = 0; i < 30; i++) {
            if (i == 14) {
                System.out.print("*" + method + "*");
            }
            System.out.print("-");
        }
        System.out.println();
    }

    public void reverList() {
        Node node1 = null;
        Node node2 = head.next;
        Node node3 = node2.next;
        while (node2 != null) {
            node2.next = node1;
            if (node3 == null) break;
            node1 = node2;
            node2 = node3;
            node3 = node3.next;
        }
        head.next = node2;
    }
}
