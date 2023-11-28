package com.hochschule.bmi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hochschule.bmi.entity.Contact;
import com.hochschule.bmi.repo.ContactRepository;

import java.util.List;

// Anmoldeep Angadi Manjunatha,
//  Matriculation : 1453520, Date:07/11/2023

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
