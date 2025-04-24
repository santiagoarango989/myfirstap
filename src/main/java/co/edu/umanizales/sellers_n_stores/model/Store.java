package co.edu.umanizales.sellers_n_stores.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Store {

    private String StoreDescription;
    private String StoreName;
    private String StoreAddress;
    private Location location;
}
