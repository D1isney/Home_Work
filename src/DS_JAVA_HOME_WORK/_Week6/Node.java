package _Week6;

public class Node {
    private String Name;
    private String Sex;
    private Integer id;
    Node next;

    public Node(String name, String sex, Integer id) {
        Name = name;
        Sex = sex;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", id=" + id +
                ", next=" + next +
                '}';
    }
}
