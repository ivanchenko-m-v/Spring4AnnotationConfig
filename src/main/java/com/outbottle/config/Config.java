/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.config;

/**
 *
 * @author mivanchenko
 */
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;  
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;  
import org.springframework.web.servlet.view.UrlBasedViewResolver;  
  
@Configuration
@ComponentScan("com.outbottle")
@EnableWebMvc   
@EnableJpaRepositories
@Import({DbConfig.class})
public class Config extends WebMvcConfigurerAdapter {  
        @Bean  
        public UrlBasedViewResolver setupViewResolver() { 
            UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
           try
            {
                 resolver.setPrefix("/WEB-INF/jsp/");  
                resolver.setSuffix(".jsp");  
                resolver.setViewClass(JstlView.class);  
            }
            catch(Exception ex)
            {
                        
            }
            return resolver;  
        }  

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
            //registry.addResourceHandler("/resources/css/**").addResourceLocations("/WEB-INF/resources/css/");
            //registry.addResourceHandler("/resources/js/**").addResourceLocations("/WEB-INF/resources/js/");
        }
 }  