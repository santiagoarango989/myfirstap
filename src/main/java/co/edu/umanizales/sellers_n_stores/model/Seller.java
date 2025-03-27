package co.edu.umanizales.sellers_n_stores.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Seller {

    private String id;
    private String name;
    private String lName;
    private String gender;
    private byte age;
    private Location city;

    public Seller(String id, String name, String lName, String gender, byte age, Location city) {
        this.id = id;
        this.name = name;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Seller(String number, String tiba, String vargas, Location manizales, byte age) {
    }
}
