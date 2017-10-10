package vn.its.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import vn.its.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    List<Contact> findByNameContaining(String q);

}