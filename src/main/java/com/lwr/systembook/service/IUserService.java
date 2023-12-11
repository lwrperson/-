package com.lwr.systembook.service;


import com.lwr.systembook.entity.User;
import org.apache.ibatis.annotations.Mapper;

//用户模块业务层接口
@Mapper
public interface IUserService {
    /**
    * 用户注册方法
    * @param user 用户数据对象
    * */
    void reg(User user);

    //将当前登陆成功的用户数据以当前用户对象的形式进行返回。
    /**
     * 状态管理：可以将数据保存在cooki或者session中，可以比避免重复度很高的数据多次频繁操作数据进行获取（用户名，用户id-存放在
     * session中，用户头像-保存在cookie中）。
     *
     * **/

    /**
     * 用户登陆功能
     * @param username 用户名
     * @param password 用户密码
     * @return 当前匹配的用户数据，如果没有则返回null值
     * */
    User login(String username,String password);
}
