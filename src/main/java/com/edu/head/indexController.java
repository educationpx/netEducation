package com.edu.head;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pei.xu on 2015/11/15.
 */
@Controller
@RequestMapping("head")
public class indexController {

    @RequestMapping("index.do")
    public String index() {

        return "index";
    }
}
