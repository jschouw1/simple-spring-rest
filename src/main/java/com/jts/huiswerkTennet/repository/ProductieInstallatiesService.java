package com.jts.huiswerkTennet.repository;

import com.jts.huiswerkTennet.model.ProductieInstallaties;
import org.springframework.data.repository.CrudRepository;


public interface ProductieInstallatiesService extends CrudRepository<ProductieInstallaties, Integer> {

    Iterable<ProductieInstallaties> findByName(String name);
    Iterable<ProductieInstallaties> findByOutputPower(double outputPower);

}
