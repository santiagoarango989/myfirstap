package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Location;
import co.edu.umanizales.sellers_n_stores.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/seller")

public class SellerController {
    @GetMapping
    public Seller getSeller() {

        Location manizales = new Location("17001", "Manizales");

        Seller penelope = new Seller("10282329", "Penelope", "Vargas", manizales, (byte)36);
        Seller marcela = new Seller("3212823", "Marcela", "Vergara", manizales, (byte)45);
        Seller elver = new Seller("100235432", "Elver", "Galarga", manizales, (byte)60);
        Seller Malinco = new Seller("123453231", "Malinco", "Juarez", manizales, (byte)40);
        Seller tiba = new Seller("3456787654", "Tiba", "Vargas", manizales, (byte)36);

        return marcela;
    }
}
