package com.jts.huiswerkTennet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactPersonen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int contactPersonenId;
    String name;
    String zipCode;
    String city;
    String number;

    public ContactPersonen() {
    }

    public ContactPersonen(String name, String zipCode, String city, String number) {
        this.name = name;
        this.zipCode = zipCode;
        this.city = city;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactPersonen{" +
                "name='" + name + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
