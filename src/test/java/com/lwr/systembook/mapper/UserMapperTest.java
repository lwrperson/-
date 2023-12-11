package com.lwr.systembook.mapper;


import com.lwr.systembook.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

//@SpringBootTest：表示标注当前的类是一个测试类，不会随同项目一块打包
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserMapper userMapper;
    //单选测试方法：单独运行
    //1.必须被Test注解修饰
    //2.返回值类型必须是void
    //3.方法的参数列表不指定任何类型
    //4.方法的访问修饰符必须是public
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("tim");
        user.setPassword("123456");
//        System.out.println(user.getUsername() + user.getPassword());
        Integer rows = userMapper.insert(user);
        System.out.println(rows);

    }
    @Test
    void getConnection() throws SQLException{
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("tim");
        System.out.println(user);
    }
}
