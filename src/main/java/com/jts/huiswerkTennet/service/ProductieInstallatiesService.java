package com.jts.huiswerkTennet.service;

import com.jts.huiswerkTennet.model.ProductieInstallaties;
import org.springframework.data.repository.CrudRepository;


public interface ProductieInstallatiesService extends CrudRepository<ProductieInstallaties, Integer> {

    Iterable<ProductieInstallaties> getOneById(int id);
    Iterable<ProductieInstallaties> findByName(String name);
    Iterable<ProductieInstallaties> findByOutputPowerGreaterThanAndOutputPowerLessThan(double outputPowerBottom, double outputPowerTop);

}
