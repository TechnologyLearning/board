package com.telstra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rama Gondesi.
 */
@Controller
public class DashboardController {
    @RequestMapping(value = "/")
    public String monitor(){
        return "dashboard";
    }
}
