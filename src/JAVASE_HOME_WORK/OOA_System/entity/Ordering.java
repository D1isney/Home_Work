package OOA_System.entity;

import java.util.Date;

//  点餐记录
public class Ordering {
    private String dishesNumber;    //  菜品编号
    private String dishesName;  //  菜品名称
    private Date orderTime; //点餐时间

    private String cuisines;    //菜系
    private Integer weight;     //菜品份量
    private String orderUser;       //点餐用户

    @Override
    public String toString() {
        return "Ordering{" +
                "dishesNumber='" + dishesNumber + '\'' +
                ", dishesName='" + dishesName + '\'' +
                ", orderTime=" + orderTime +
                ", cuisines='" + cuisines + '\'' +
                ", weight=" + weight +
                ", orderUser='" + orderUser + '\'' +
                '}';
    }

    public Ordering() {
    }

    public Ordering(String dishesNumber, String dishesName, Date orderTime, String cuisines, Integer weight, String orderUser) {
        this.dishesNumber = dishesNumber;
        this.dishesName = dishesName;
        this.orderTime = orderTime;
        this.cuisines = cuisines;
        this.weight = weight;
        this.orderUser = orderUser;
    }
}
