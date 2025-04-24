package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Store;
import co.edu.umanizales.sellers_n_stores.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path= "/store")

public class StoreController {

    @Autowired
    private StoreService storeService;

   /*
    @GetMapping
    public String getStore() {


        return "Store A";
    }
    */

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }
}
