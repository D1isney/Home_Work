package OOA_System.entity;

/**
 * 菜品类
 */
public class Dishes {
    private String dishesId;    //  菜品编号
    private String dishesName;  //  菜品名称
    private float dishesPrice;  //  菜品价格
    private String cuisines;    //  菜系
    private float dishesIntegral;   //  菜品积分

    public Dishes(String dishesId, String dishesName, float dishesPrice, String cuisines, float dishesIntegral) {
        this.dishesId = dishesId;
        this.dishesName = dishesName;
        this.dishesPrice = dishesPrice;
        this.cuisines = cuisines;
        this.dishesIntegral = dishesIntegral;
    }

    public Dishes() {
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "dishesId='" + dishesId + '\'' +
                ", dishesName='" + dishesName + '\'' +
                ", dishesPrice=" + dishesPrice +
                ", cuisines='" + cuisines + '\'' +
                ", dishesIntegral=" + dishesIntegral +
                '}';
    }

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public float getDishesPrice() {
        return dishesPrice;
    }

    public void setDishesPrice(float dishesPrice) {
        this.dishesPrice = dishesPrice;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public float getDishesIntegral() {
        return dishesIntegral;
    }

    public void setDishesIntegral(float dishesIntegral) {
        this.dishesIntegral = dishesIntegral;
    }
}
