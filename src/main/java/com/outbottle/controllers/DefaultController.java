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
public class DefaultController {
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       return "index";
   }

   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public String test(ModelMap map) {
       map.put("msg", "test message PUK");
       return "test";
   }

   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(ModelMap map) {
       return "login";
   }
  
}