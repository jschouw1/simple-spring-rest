package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ProductieInstallaties;
import com.jts.huiswerkTennet.service.ProductieInstallatiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductieInstallatiesController {

    @Autowired private ProductieInstallatiesService productieInstallatiesService;

    @PostMapping("/productieInstallaties")
    public ProductieInstallaties create(@RequestBody ProductieInstallaties productieInstallaties){
        return productieInstallatiesService.save(productieInstallaties);
    }
}
