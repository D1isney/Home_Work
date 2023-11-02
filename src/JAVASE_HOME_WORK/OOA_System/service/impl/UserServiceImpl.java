package OOA_System.service.impl;

import OOA_System.entity.User;
import OOA_System.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    /**
     * 查询用户信息
     * @return
     */
    @Override
    public List<User> queryUser() {
        System.out.println("查询");
        return null;
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public int innerUser(User user) {
        System.out.println("新增");

        return 0;
    }


}
