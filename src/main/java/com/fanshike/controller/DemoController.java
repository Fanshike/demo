package com.fanshike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yang xing
 * @Description:
 * @Date: Created at 10:13 2018/12/24
 * @Modified By:
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/get")
    public String getName(){
        return "ok";
    }
}
