/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 /**
 *
 * @author mivanchenko
 */
@Controller
public class UserOrderController {
    
    @RequestMapping(value = "/user_order", method = RequestMethod.GET)
    public String user_order(ModelMap map) {
        return "user_order";
    }
    
}
