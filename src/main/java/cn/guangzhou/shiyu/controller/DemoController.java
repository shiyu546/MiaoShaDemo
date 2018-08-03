package cn.guangzhou.shiyu.controller;

import cn.guangzhou.shiyu.infra.CodeMsg;
import cn.guangzhou.shiyu.infra.ErrorMsg;
import cn.guangzhou.shiyu.infra.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/8/3.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public Result<Object> hello(){
        return Result.success("hello,my friend");
    }

    @RequestMapping("/helloError")
    @ResponseBody
    public Result<Object> helloError(){
        return Result.failure(ErrorMsg.SERVER_FAILURE,"服务端发生了不可知的错误");
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
       model.addAttribute("name","Shiyu");
       return "hello";
    }

}
