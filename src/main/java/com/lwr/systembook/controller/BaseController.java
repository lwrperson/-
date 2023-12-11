package com.lwr.systembook.controller;


import com.lwr.systembook.service.ex.*;
import com.lwr.systembook.util.JsonResult;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ExceptionHandler;

//控制层的基类
public class BaseController {
    //操作成功的状态码
    public static final int OK = 200;


    //请求处理方法，这个方法的返回值就是需要传递给前端的数据
    //自动将异常对象传递给此方法的参数列表上
    //当项目中产生了异常，被统一拦截到此方法中，这个方法就充当的是请求处理方法，方法的返回值直接给到前端
    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if (e instanceof UsernameDuplicatedException){
            result.setState(4000);
            result.setMessage("用户名已经被占用");
        }  else if (e instanceof UsernameNotFoundException) {
            result.setState(5001);
            result.setMessage("用户数据不存在的异常");
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("用户名的密码错误异常");
        }
        else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("注册时产生了未知的异常");
        }
        return result;
    }

    /**
     * 获取session对象中的uid
     * @param session session对象
     * @return  当前登陆用户uid的值
     * * **/
    protected final Integer getUidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("uid").toString());

    }

    /** 获取session对象中的username
     * @param session session对象
     * @return  当前登陆用户的用户名
     * * **/

    protected final String getUsernameFromSession(HttpSession session){
        return session.getAttribute("username").toString();
    }

}
