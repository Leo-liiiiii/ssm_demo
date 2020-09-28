package com.ujiuye.ssm.controller;

import com.ujiuye.ssm.pojo.Girl;
import com.ujiuye.ssm.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author LiLe
 * @create 2020-08-17 16:20
 */
@Controller
@RequestMapping("girl")
public class GirlController {

    @Autowired
    private GirlService girlService;


    @GetMapping("list")
    public String  list(Model model){
        List<Girl> list = girlService.findAll();
        //int i=1/0;
        model.addAttribute("girls",list);
        return "success";
    }

}
