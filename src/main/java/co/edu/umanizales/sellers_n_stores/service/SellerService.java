package co.edu.umanizales.sellers_n_stores.service;

import co.edu.umanizales.sellers_n_stores.model.Seller;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Getter
@Service
public class SellerService {

    private final LocationService locationService;

    @Value("${sellers_filename}")
    private String sellersfilename;

    List<Seller> sellers;

    public void readSellersFromCsv() throws IOException {}

}
