package vn.its.service;

import java.util.List;

import vn.its.domain.Contact;

public interface ContactService {

    Iterable<Contact> findAll();

    List<Contact> search(String q);

    Contact findOne(int id);

    void save(Contact contact);

    void delete(int id);

}