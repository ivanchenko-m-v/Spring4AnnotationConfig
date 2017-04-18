/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.services;

import com.outbottle.entities.Contact;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mivanchenko
 */
public interface ContactRepository extends CrudRepository<Contact,Integer>{
    List<Contact> findByFirstName(String firstName);
}