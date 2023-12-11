package com.lwr.systembook.controller;


import com.lwr.systembook.entity.User;
import com.lwr.systembook.service.IUserService;
import com.lwr.systembook.service.ex.InsertException;
import com.lwr.systembook.service.ex.UsernameDuplicatedException;
import com.lwr.systembook.util.JsonResult;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//状态管理
@RestController//@Controller+@ResponseBody
@RequestMapping("users")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        userService.reg(user);
        return new JsonResult<>(OK);
    }


    @RequestMapping("login")
    public JsonResult<User> login(String username, String password, HttpSession session){
      User data =  userService.login(username,password);

      session.setAttribute("uid",data.getUid());
      session.setAttribute("username",data.getUsername());

        return new JsonResult<User>(OK,data);
    }
        //创建响应结果对象
       /* JsonResult<Void> result = new JsonResult<>();
        try {
            userService.reg(user);
            result.setState(200);
            result.setMessage("用户注册成功");
        } catch (UsernameDuplicatedException e) {
            result.setState(4000);
            result.setMessage("用户名被占用");
        }catch (InsertException e) {
            result.setState(5000);
            result.setMessage("注册是产生未知的异常");
        }*/



}
