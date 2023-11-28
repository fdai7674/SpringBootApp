package com.hochschule.bmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hochschule.bmi.entity.Contact;
import com.hochschule.bmi.service.ContactService;

import java.util.List;

// Anmoldeep Angadi Manjunatha,
//  Matriculation : 1453520, Date:07/11/2023

@RestController
@RequestMapping("/contacts")
@CrossOrigin
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }
    @CrossOrigin
    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }
}
