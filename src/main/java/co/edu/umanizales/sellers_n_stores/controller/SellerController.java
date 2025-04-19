package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Location;
import co.edu.umanizales.sellers_n_stores.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/seller")

public class SellerController {

    @GetMapping
    public List<Seller> getSeller() {

        Location manizales = new Location("17001", "Manizales");
        Location Pereira = new Location("66001", "pereira");

        List<Seller> sellers = new ArrayList<>();
        sellers.add(new Seller("10282329", "Penelope", "Vargas", "f" , (byte) 36, manizales));
        sellers.add(new Seller("123154548","Marcela", "Vergara", "f", (byte)45, manizales));
        sellers.add(new Seller("100235432", "Elver", "Galarga", "m", (byte)60, Pereira));
        sellers.add(new Seller("123453231", "Malinco", "Juarez", "m", (byte)40, manizales));
        sellers.add(new Seller("3456787654", "Tiba", "Vargas", "m", (byte)36, Pereira));


        return sellers;
    }
}
