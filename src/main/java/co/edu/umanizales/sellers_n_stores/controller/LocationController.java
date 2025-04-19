package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Location;
import co.edu.umanizales.sellers_n_stores.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path= "/location")

public class LocationController {

    /*
    @GetMapping
    public String getLocation() {
        Location manizales = new Location("17001", "Manizales");

        return "Manizales";
    }
     */
    @Autowired
    private LocationService locationService = new LocationService();

        @GetMapping
        public List<Location> getLocations() {
            return locationService.getLocations();
        }

        @GetMapping(path = "/{code}")
        public Location getLocationsByCode(@PathVariable String code) {
            return locationService.getLocationsByCode(code);
        }
}
