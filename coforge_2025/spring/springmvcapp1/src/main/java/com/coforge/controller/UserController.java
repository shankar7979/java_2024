package com.coforge.controller;

import com.coforge.model.Employee;
import com.coforge.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userform")
    public String init(ModelMap map){
        User user=new User();
        map.addAttribute("user",user);
        return "userform";
    }

    @RequestMapping("/userAction")
    public String userValidate(@Valid User user,BindingResult result){
     if(result.hasErrors()){
         return  "userform";
     }
     else {
         return  "userresult";
     }
    }

}
