package co.edu.umanizales.sellers_n_stores.service;

import co.edu.umanizales.sellers_n_stores.model.Location;
import co.edu.umanizales.sellers_n_stores.model.Store;
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

public class StoreService {
    private final LocationService locationService;
    private List<Store> stores;

    @Value("${stores_filename}")
    private String filename;

    public StoreService(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostConstruct
    public void readStoresFromCSV() throws IOException, URISyntaxException {
        stores = new ArrayList<>();

        Path path = Paths.get(ClassLoader.getSystemResource(filename).toURI());

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            boolean firstLine = true;

            String[] tokens;
            String storeDescription, storeCode, storeAddress, locationCode;
            Location location;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                tokens = line.split(",");
                storeDescription = tokens[0];
                storeCode = tokens[1];
                storeAddress = tokens[2];
                locationCode = tokens[3];

                location = locationService.getLocationsByCode(locationCode);
                if (location == null) {
                    location = new Location(locationCode, "Descripción no encontrada");
                }
                Store store = new Store(storeDescription, storeCode, storeAddress, location);
                stores.add(store);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Store> getAllStores() {
        return stores;
    }
}
