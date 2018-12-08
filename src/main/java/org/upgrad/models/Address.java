package org.upgrad.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name = "address")
public class Address {


    @Id
    @Column(name = "id")
    private int id;


    @Column(name="locality")
    private String locality;

    @Column(name="flat_buil_number")
    private String flat_buil_number;

    @Column(name="city")
    private String city;

    @Column(name="zipcode")
    private String zipcode;

    @Column(name="state_id")
    private int state_id;

    private Address(){};

    public Address(int id, String locality, String flat_buil_number, String city, String zipcode, int state_id) {
        this.id = id;
        this.locality = locality;
        this.flat_buil_number = flat_buil_number;
        this.city = city;
        this.zipcode = zipcode;
        this.state_id = state_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getFlat_buil_number() {
        return flat_buil_number;
    }

    public void setFlat_buil_number(String flat_buil_number) {
        this.flat_buil_number = flat_buil_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id &&
                state_id == address.state_id &&
                Objects.equals(locality, address.locality) &&
                Objects.equals(flat_buil_number, address.flat_buil_number) &&
                Objects.equals(city, address.city) &&
                Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, locality, flat_buil_number, city, zipcode, state_id);
    }

    @Override
    public String toString() {
        return "Address[" +
                "id=" + id +
                ", locality='" + locality + '\'' +
                ", flat_buil_number='" + flat_buil_number + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", state_id=" + state_id +
                ']';
    }
}
