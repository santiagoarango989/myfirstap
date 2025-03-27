package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path= "/sale")

public class SaleController {
    @GetMapping
    public String getSales() {


        return "10 sales confirmed";
    }
}
