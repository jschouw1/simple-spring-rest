package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ProductieInstallaties;
import com.jts.huiswerkTennet.service.ProductieInstallatiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductieInstallatiesController {

    @Autowired private ProductieInstallatiesService productieInstallatiesService;

    @PostMapping("/productieInstallaties")
    public ProductieInstallaties create(@RequestBody ProductieInstallaties productieInstallaties){
        return productieInstallatiesService.save(productieInstallaties);
    }

    @GetMapping("/productieInstallaties")
    public Iterable<ProductieInstallaties> findAll() {
        return productieInstallatiesService.findAll();
    }

    @GetMapping("/productieInstallaties/id/{id}")
    public Iterable findById(@PathVariable("id") int id) {
        return productieInstallatiesService.getOneById(id);
    }

    @GetMapping("/productieInstallaties/name/{name}")
    public Iterable findByName(@PathVariable("name") String name) {
        return productieInstallatiesService.findByName(name);
    }

    @GetMapping("/productieInstallaties/outputPower/{outputPower}")
    public Iterable findByOutputPower(@PathVariable("outputPower") double outputPower) {
        return productieInstallatiesService.findByOutputPower(outputPower);
    }


}
