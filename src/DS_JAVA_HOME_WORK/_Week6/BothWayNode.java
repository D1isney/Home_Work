package _Week6;

public class BothWayNode {
    BothWayNode pre;
    private String Name;
    private String Sex;
    private Integer id;

    BothWayNode next;

    public BothWayNode(String name, String sex, Integer id) {
        Name = name;
        Sex = sex;
        this.id = id;
    }

    @Override
    public String toString() {
        return "BothWayNode{" +
                "pre=" + pre +
                ", id=" + id +
                ", next=" + next +
                '}';
    }
}
