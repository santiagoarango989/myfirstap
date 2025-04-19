package co.edu.umanizales.sellers_n_stores.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {

    private String id;
    private String name;
    private String lName;
    private String gender;
    private byte age;
    private Location city;

}
