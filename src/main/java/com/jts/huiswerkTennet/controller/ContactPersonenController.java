package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ContactPersonen;
import com.jts.huiswerkTennet.service.ContactPersonenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContactPersonenController {

    @Autowired private ContactPersonenService contactPersonenService;

    @PostMapping("/contactPersonen")
    public ContactPersonen create(@RequestBody ContactPersonen contactPersonen) throws Exception{
        if (contactPersonen.getName() == null || contactPersonen.getName().equals(""))
            throw new Exception("Name");
        else if (contactPersonen.getZipCode() == null || contactPersonen.getZipCode().length() != 6 || !contactPersonen.getZipCode().matches("\\d{4}\\p{Alpha}{2}"))
            throw new Exception("Zip code");
        else if (contactPersonen.getCity() == null || contactPersonen.getCity().equals(""))
            throw new Exception("City");
        else if (contactPersonen.getNumber() == null || contactPersonen.getNumber().equals(""))
            throw new Exception("Number");
        else
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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        return e.getMessage() + " ongeldig, contactpersoon niet opgeslagen.";
    }



}
