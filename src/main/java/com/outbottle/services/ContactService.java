/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbottle.services;

import com.outbottle.entities.Contact;
import java.util.List;

/**
 *
 * @author mivanchenko
 */
public interface ContactService {
    List<Contact> findAll();
    List<Contact> findByFirstName(String firstName);
    Contact findById(Integer id);
    Contact save(Contact contact);
    void delete(Contact contact);
}