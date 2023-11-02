package OOA_System.entity;

import java.util.Date;

// 用户信息
public class User {
    private String id;  //  id
    private String userName; // 用户名
    private Date dateOfBirth;   //  出生年月日
    private Integer integral;   //  积分
    private String account;     //  账号
    private String passWord;    //  密码
    private float userMoney;    //  余额

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", integral=" + integral +
                ", account='" + account + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userMoney=" + userMoney +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public float getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(float userMoney) {
        this.userMoney = userMoney;
    }

    public User() {
    }

    public User(String id, String userName, Date dateOfBirth, Integer integral, String account, String passWord, float userMoney) {
        this.id = id;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.integral = integral;
        this.account = account;
        this.passWord = passWord;
        this.userMoney = userMoney;
    }
}
