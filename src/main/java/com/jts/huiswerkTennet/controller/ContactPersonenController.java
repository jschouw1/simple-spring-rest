package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ContactPersonen;
import com.jts.huiswerkTennet.service.ContactPersonenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/contactPersonen/id/{id}")
    public Iterable findById(@PathVariable("id") int id) {
        return contactPersonenService.getOneById(id);
    }



}
