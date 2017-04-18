/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.controllers;

import com.outbottle.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 *
 * @author mivanchenko
 */
@Controller
public class DefaultController {
    
    @Autowired
    ApplicationContext context;
     
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.put("msg", "Hello Spring 4 Web MVC!");
        return "index";
    }

   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public String test(ModelMap map) {
        ContactService bean = context.getBean(ContactService.class);
        StringBuilder sb = new StringBuilder("<br>");
        bean.findAll().forEach(it->sb.append(it.toString()).append("<br>"));
        map.put("msg", "test message PUK");
        return "test";
   }

}