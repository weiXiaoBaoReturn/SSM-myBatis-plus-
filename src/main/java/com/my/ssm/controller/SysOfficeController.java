package com.my.ssm.controller;

import com.my.ssm.entity.SysOffice;
import com.my.ssm.service.SysOfficeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import java.util.List;

/**
 * Created by ${wb} on 2017/4/27.
 */
@RestController
@RequestMapping("/office")
public class SysOfficeController {
    @Resource
    private SysOfficeService sysOfficeService;
    @RequestMapping("selectOffice")
    public String toIndex(HttpServletRequest request, Model model){
        List<SysOffice> sysOffice = sysOfficeService.getOffice();
        for(SysOffice office:sysOffice){
            System.out.println("单位名称："+office.getName());
        }
        model.addAttribute("offices", sysOffice);
        return "selectOffice";
    }

    @RequestMapping(value = "selectAllOffice",method = RequestMethod.POST)
    public List<SysOffice> selectAllOffice(Model model){
        List<SysOffice> sysOffice = sysOfficeService.getOffice();
        return sysOffice;
    }
}
