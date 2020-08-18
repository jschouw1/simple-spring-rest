package com.jts.huiswerkTennet.model;

import javax.persistence.*;

@Entity
@Table(name = "contact_personen")
public class ContactPersonen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "zip_code")
    String zipCode;

    @Column(name = "city")
    String city;

    @Column(name = "number")
    String number;

    public ContactPersonen() {
    }

    public ContactPersonen(String name, String zipCode, String city, String number) {
        this.name = name;
        this.zipCode = zipCode;
        this.city = city;
        this.number = number;
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
                "contactPersonenId=" + id +
                ", name='" + name + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
