package co.edu.umanizales.sellers_n_stores.service;

import co.edu.umanizales.sellers_n_stores.model.Location;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Getter
@Service

public class LocationService {
    private List<Location> locations;

    @Value("${locations_filename}")
    private String locationsFilename;

    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException {
        locations = new ArrayList<>();

        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile.toString()))) {
            String line;


            String[] tokens;
            String code, description;

            while ((line = br.readLine()) != null) {
                tokens = line.split(",");
                if (tokens.length >= 4) {
                    code = tokens[2];
                    description = tokens[3];
                    locations.add(new Location(code, description));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Location getLocationsByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code)) {
                return location;
            }
        }
        return null;
    }

    public Location getLocationsByName(String name) {
        for (Location location : locations) {
            if (location.getDescription().equalsIgnoreCase(name)){
                return location;
            }
        }
        return null;
    }

    public List<Location> getLocationsByInitialLetter(String Letter) {
        for (Location location : locations) {
            if (location.getDescription().startsWith(Letter)) {
                return locations;
            }
        }
        return null;
    }

    public List<Location> getLocationsByStateCode(String stateCode) {
        for (Location location : locations) {
            if (location.getCode().startsWith(stateCode)) {
                return locations;
            }
        }
        return null;
    }

    public List<Location> getStates() {
        List<Location> states = new ArrayList<>();
        for (Location location : locations) {
            states.add(location);
        }
        return states;
    }

    public Location getStateByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code)) {
                return location;
            }
        }
        return null;
    }

    public List<Location> getCapitals() {
        for (Location location : locations) {
            if (location.getCode().endsWith("001")) {
                return locations;
            }
        }
        return null;
    }

    public List<Location> getLocationByinitialAndLastLetter(String initialLetter, String finalLetter) {
        List<Location> results = new ArrayList<>();
        for (Location l : locations) {
            if (l.getDescription().startsWith(initialLetter) && l.getDescription().endsWith(finalLetter)) {
                results.add(l);
            }
        }
        return results;
    }
}
