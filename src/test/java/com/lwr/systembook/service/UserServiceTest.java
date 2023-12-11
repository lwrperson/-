package com.lwr.systembook.service;


import com.lwr.systembook.entity.User;
import com.lwr.systembook.mapper.UserMapper;
import com.lwr.systembook.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

//@SpringBootTest：表示标注当前的类是一个测试类，不会随同项目一块打包
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private IUserService userService;
    //单选测试方法：单独运行
    //1.必须被Test注解修饰
    //2.返回值类型必须是void
    //3.方法的参数列表不指定任何类型
    //4.方法的访问修饰符必须是public
    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("lisi4");
            user.setPassword("123");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            //获取类的对象，在获取类的名称
            System.out.println(e.getClass().getSimpleName());
            //获取异常的具体描述信息
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void login(){
        User user = userService.login("test01","123");
        System.out.println(user);
    }

}
