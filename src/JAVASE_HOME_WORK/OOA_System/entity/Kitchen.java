package OOA_System.entity;

//  后厨接收记录
public class Kitchen {
    private String dishesNumber;    //  菜品编号
    private String dishesName;  //  菜品名称
    private String mealTime;    //  点餐时间
    private Boolean soldOutSituation;   //  售罄情况


    public Kitchen() {
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "dishesNumber='" + dishesNumber + '\'' +
                ", dishesName='" + dishesName + '\'' +
                ", mealTime='" + mealTime + '\'' +
                ", soldOutSituation=" + soldOutSituation +
                '}';
    }

    public String getDishesNumber() {
        return dishesNumber;
    }

    public void setDishesNumber(String dishesNumber) {
        this.dishesNumber = dishesNumber;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public Boolean getSoldOutSituation() {
        return soldOutSituation;
    }

    public void setSoldOutSituation(Boolean soldOutSituation) {
        this.soldOutSituation = soldOutSituation;
    }

    public Kitchen(String dishesNumber, String dishesName, String mealTime, Boolean soldOutSituation) {
        this.dishesNumber = dishesNumber;
        this.dishesName = dishesName;
        this.mealTime = mealTime;
        this.soldOutSituation = soldOutSituation;
    }
}
