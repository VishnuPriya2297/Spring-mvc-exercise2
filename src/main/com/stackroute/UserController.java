package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView login( @ModelAttribute("User") User user)
    {
        //user.setName(Name);
        //user.setPassword(Password);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("target",user.getName());
        return mv;
    }

}
