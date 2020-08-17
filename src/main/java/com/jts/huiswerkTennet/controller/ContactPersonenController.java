package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ContactPersonen;
import com.jts.huiswerkTennet.repository.ContactPersonenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactPersonenController {

    @Autowired private ContactPersonenService contactPersonenService;

    @PostMapping("/contactPersonen")
    public ContactPersonen create(@RequestBody ContactPersonen contactPersonen){
        return contactPersonenService.save(contactPersonen);
    }

    @GetMapping("/contactPersonen")
    public Iterable<ContactPersonen> findAll(){
        return contactPersonenService.findAll();
    }



}
