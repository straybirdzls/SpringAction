package com.hao.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author lingxue created on 10/4/16
 * @version v0.1
 **/

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = GET)
    public String home(){
        return "home";
    }

}
