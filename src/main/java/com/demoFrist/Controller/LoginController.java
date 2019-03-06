package com.demoFrist.Controller;

import com.demoFrist.Service.MemberService;
import com.demoFrist.domain.Member;
import com.demoFrist.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.Controller
 * @ClassName: LoginController
 * @Author: Lenovo
 * @Description: 用户登录Controller
 * @Date: 2019/3/5 18:32
 * @Version: 1.0
 */
@Controller
@RequestMapping("/SSMProject")
public class LoginController {

    @Autowired
    private MemberService memberService;


    @RequestMapping("/Jump")
    public String LoginService(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(new Date());
        System.out.println("首页访问。。。访问时间"+format);
        return "index";
    }


    @RequestMapping("/Login")
    @ResponseBody
    public Result Login(@RequestParam("logname") String Username,@RequestParam("logpass") String Password){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg("登陆失败");

        System.out.println("用户名  "+Username);
        System.out.println("密码  "+Password);
        try {
            Member login = memberService.login(Username, Password);
            if(login != null){
                result.setSuccess(true);
                result.setMsg("登陆成功");
                return result;
            }else{
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
    }





}
