package OOA_System.service;

import OOA_System.entity.User;

import java.util.List;

//  接口
public interface UserService {
    //  查询信息
    List<User> queryUser();

    //  新增用户
    int innerUser(User user);
}
