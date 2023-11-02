package OOA_System;

import OOA_System.entity.User;
import OOA_System.service.impl.UserServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class testMain {
    /*
    * 请选择主菜单：
        1、教师信息管理
        2、学生信息管理
        3、课程信息管理
        4、选课管理
        5、退出程序
    * */
    static Scanner sc = new Scanner(System.in);
    static UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) {
        Menu();
    }

    public static int randomNum(){
        int i = sc.nextInt();
        return i;
    }

    /**
     * 主菜单
     */
    public static void Menu() {
        System.out.println("请选择主菜单：");
        System.out.println("\t" + "1、用户信息管理");
        System.out.println("\t" + "2、菜品信息管理");
        System.out.println("\t" + "3、后厨信息管理");
        System.out.println("\t" + "4、点餐管理");
        System.out.println("\t" + "5、退出程序");
        switch (randomNum()){
            case 1:
                UserMsgMenu();
                break;
            case 2:
                break;
            case 5:
                System.exit(1);
        }
    }

    /**
     * 用户信息管理
     */
    public static void UserMsgMenu() {
        System.out.println();
        System.out.println("用户信息管理：");
        System.out.println("\t" + "1、新增用户信息");
        System.out.println("\t" + "2、删除用户信息");
        System.out.println("\t" + "3、修改用户信息");
        System.out.println("\t" + "4、查找用户信息");
        System.out.println("\t" + "5、返回主菜单");
        System.out.println("\t" + "6、退出程序");

        switch (randomNum()){
            case 1:
                userService.innerUser(new User());
                break;
        }
    }
}
