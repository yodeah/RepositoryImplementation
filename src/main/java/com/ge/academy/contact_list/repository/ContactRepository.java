package com.ge.academy.contact_list.repository;

import com.ge.academy.contact_list.entity.Contact;
import com.ge.academy.contact_list.exception.EntityNotFoundException;

import java.util.List;

/**
 * Created by 212564370 on 6/13/2016.
 */
public interface ContactRepository {
    Contact save(Contact user) throws EntityNotFoundException;
    void delete(String contactId) throws EntityNotFoundException;
    Contact findOne(String contactId) throws EntityNotFoundException;
    List<Contact> findAll();
    Contact findByExample(Contact contact) throws EntityNotFoundException;
}
