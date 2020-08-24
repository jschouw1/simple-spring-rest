package com.jts.huiswerkTennet.controller;

import com.jts.huiswerkTennet.model.ProductieInstallaties;
import com.jts.huiswerkTennet.service.ProductieInstallatiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductieInstallatiesController {

    @Autowired private ProductieInstallatiesService productieInstallatiesService;

    @PostMapping("/productieInstallaties")
    public ProductieInstallaties create(@RequestBody ProductieInstallaties productieInstallaties) throws Exception {
        if (productieInstallaties.getName() == null || productieInstallaties.getName().equals(""))
            throw new Exception("Name ongeldig");
        else if (productieInstallaties.getContact() < 0)
            throw new Exception("Contact ongeldig");
        else if (productieInstallaties.getOutputPower() < 0.0001 || productieInstallaties.getOutputPower() > 999999)
            throw new Exception("Output power ongeldig");
        else
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

    @GetMapping("/productieInstallaties/outputPower/{outputPowerBottom}/{outputPowerTop}")
    public Iterable findByOutputPowerGreaterThanAndOutputPowerLessThan(@PathVariable("outputPowerBottom") double outputPowerBottom, @PathVariable("outputPowerTop") double outputPowerTop) throws Exception {
        if (outputPowerBottom > outputPowerTop)
            throw new Exception("Ondergrens hoger dan bovengrens");
        else
            return productieInstallatiesService.findByOutputPowerGreaterThanAndOutputPowerLessThan(outputPowerBottom, outputPowerTop);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        return e.getMessage() + ", probeer opnieuw.";
    }



}
