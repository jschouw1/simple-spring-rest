package com.jts.huiswerkTennet.service;

import com.jts.huiswerkTennet.model.ContactPersonen;
import org.springframework.data.repository.CrudRepository;

public interface ContactPersonenService extends CrudRepository<ContactPersonen, Integer> {

    Iterable<ContactPersonen> getOneById(int id);

}