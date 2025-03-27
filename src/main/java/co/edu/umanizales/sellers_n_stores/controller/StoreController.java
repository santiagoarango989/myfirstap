package co.edu.umanizales.sellers_n_stores.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path= "/store")

public class StoreController {
    @GetMapping
    public String getStore() {


        return "Store A";
    }
}
