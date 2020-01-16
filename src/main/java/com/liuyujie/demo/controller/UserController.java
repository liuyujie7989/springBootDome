package com.liuyujie.demo.controller;

import com.liuyujie.demo.pojo.ChangePwdReqBO;
import com.liuyujie.demo.service.ChangePwdByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-07-16 16:04
 **/
@Controller
@RequestMapping(value = "/user",method ={RequestMethod.POST})
public class UserController {

    @Autowired
    private ChangePwdByUserIdService changePasswordByUserId;
    @RequestMapping("/changeUserPwd")
    @ResponseBody
    public Object changeUserPwd(@Valid ChangePwdReqBO changePwdReqBO) {
        changePasswordByUserId.changePasswordByUserId(changePwdReqBO);
        return "HEHE";
    }
}
