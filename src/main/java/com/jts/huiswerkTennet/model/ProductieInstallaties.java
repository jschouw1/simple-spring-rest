package com.jts.huiswerkTennet.model;

import javax.persistence.*;

@Entity
@Table(name = "productie_installaties")
public class ProductieInstallaties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "contact")
    int contact;

    @Column(name = "output_power")
    double outputPower;

    public ProductieInstallaties() {
    }

    public ProductieInstallaties(String name, int contact, double outputPower) {
        this.name = name;
        this.contact = contact;
        this.outputPower = outputPower;
    }

    public int getId() {
        return id;
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
                "productieInstallatiesId=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", outputPower=" + outputPower +
                '}';
    }
}
