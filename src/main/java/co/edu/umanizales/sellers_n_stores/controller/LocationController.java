package co.edu.umanizales.sellers_n_stores.controller;

import co.edu.umanizales.sellers_n_stores.model.Location;
import co.edu.umanizales.sellers_n_stores.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.PathMatcher;
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
    @Autowired
    private PathMatcher pathMatcher;

    @GetMapping
        public List<Location> getLocations() {
            return locationService.getLocations();
        }

        @GetMapping(path = "/code/{code}")
        public Location getLocationsByCode(@PathVariable String code) {
            return locationService.getLocationsByCode(code);

        }

        @GetMapping(path = "/name/{name}")
    public Location getLocationsByName(@PathVariable String name) {
            return locationService.getLocationsByName(name);

        }
        @GetMapping(path = "/initial/{initial}")
                public List<Location> getLocationsByInitial(@PathVariable String initial) {
            return locationService.getLocationsByInitialLetter(initial);
        }
        @GetMapping(path = "/stateCode/{stateCode}")
    public List<Location> getLocationsByStateCode(@PathVariable String stateCode) {
            return locationService.getLocationsByStateCode(stateCode);
        }
        @GetMapping(path = "/states/states")
    public List<Location> getLocationsByStates() {
            return locationService.getStates();
        }
        @GetMapping(path = "/getStateByCode/{stateCode}")
    public Location getStateByCode(@PathVariable String stateCode) {
        return locationService.getStateByCode(stateCode);

        }
        @GetMapping(path = "/getsCapitals")
    public List<Location> getLocationsByCapitals() {
        return locationService.getCapitals();
        }
}
