/**
 * FileName: MyController
 * Author:   Rex
 * Date:     2018/6/13 15:20
 * Description: Controller层
 */

package com.inspur.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/where")
public class MyController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");

        return "/hello";
    }
}
