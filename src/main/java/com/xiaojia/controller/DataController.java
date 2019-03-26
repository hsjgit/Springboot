package com.xiaojia.controller;
import com.sun.webkit.Timer;
import com.xiaojia.bean.Drug;
import com.xiaojia.service.DrugService;
import com.xiaojia.xiaojia.XiaojiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;

/**
 * @author 黄仕杰
 * Created by 黄仕杰 on 2019/3/11.
 */
@Controller
public class DataController {
    @Autowired
    private DrugService drugService;
    @Autowired
    private XiaojiaService xiaojia;
    @RequestMapping("/emps")
    public String addDrug(){
        return "emp/add";
    }

    @RequestMapping("/list")
    public String list(Model model, @RequestParam(value = "str", required = false) String str, HttpServletRequest request) {
        if (str != null) {
            model.addAttribute("emps", xiaojia.sort(str));
        } else {
            model.addAttribute("emps", drugService.allDrug());
        }
        return "emp/list";
    }
    @RequestMapping("/emp")
    public String drug(Drug drug) {
        drugService.save(drug);
        return "redirect:/add.html";
    }

    @RequestMapping("/delete")
    public String deletr(int id) {
        drugService.delate(id);
        return "redirect:/list";
    }
    @RequestMapping("/update/page")
    public String update(String name,Model model){
        Drug drug=drugService.select(name);
        model.addAttribute("emp", drug);
        return "emp/update";
    }
    @RequestMapping("/update")
    public String drugupdate(String name,Double price,Integer num,Integer sales,String code){
        drugService.updata(num, price, name, sales,code);
        return "redirect:list";
    }
    @RequestMapping("blog")
    public String blog(){
        return "blog";
    }

}
