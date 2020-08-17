package com.jts.huiswerkTennet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductieInstallaties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productieInstallatiesId;
    String name;
    int contact;
    double outputPower;

    public ProductieInstallaties() {
    }

    public ProductieInstallaties(String name, int contact, double outputPower) {
        this.name = name;
        this.contact = contact;
        this.outputPower = outputPower;
    }

    public int getProductieInstallatiesId() {
        return productieInstallatiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public double getOutputPower() {
        return outputPower;
    }

    public void setOutputPower(double outputPower) {
        this.outputPower = outputPower;
    }

    @Override
    public String toString() {
        return "ProductieInstallaties{" +
                "productieInstallatiesId=" + productieInstallatiesId +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", outputPower=" + outputPower +
                '}';
    }
}
