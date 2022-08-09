package com.example.gitkrakentest3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        List<String> resultList = new ArrayList<String>();

        resultList.add("AAAA");
        resultList.add("BBBB");
        resultList.add("CCCC");
        resultList.add("DDDD");
        resultList.add("EEEF");
        resultList.add("FFFF");
        resultList.add("TEST");

        mav.addObject("resultList",resultList);
        mav.setViewName("content/home");

        return mav;
    }
}
