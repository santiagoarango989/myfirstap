package co.edu.umanizales.sellers_n_stores.service;


import co.edu.umanizales.sellers_n_stores.model.Parameter;
import co.edu.umanizales.sellers_n_stores.model.Product;
import co.edu.umanizales.sellers_n_stores.model.TypeDocuments;
import co.edu.umanizales.sellers_n_stores.model.Typeproduct;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class ParameterService {
    private List<Parameter> parameters;
    @PostConstruct
   private void loadParameters() {
       parameters = new ArrayList<Parameter>();
       // Si quiere agrega mas antes  enviarlo
       parameters.add(new TypeDocuments("CC", "Cedula de ciudadania"));
       parameters.add(new TypeDocuments("NIT", "Numero Identificacion Tributaria"));
       // debe agregar en este dos mas solo es copiar y pegar y solo los cambia por otros
        Typeproduct pcs = new Typeproduct("D","Repuestos para impresoras");
       parameters.add(new Typeproduct("A", "Impresoras 3D"));
       parameters.add(new Typeproduct("B", "Materiales para impresion"));
       parameters.add(new Typeproduct("C", "Kits de reparacion"));
       parameters.add(new Typeproduct("D", "Repuestos para impresoras"));
       parameters.add(new Typeproduct("E", ""));

   }
    public List<Parameter> getParametersByType(int type) {
        List<Parameter> result = new ArrayList<>();
        for (Parameter p : parameters) {
            switch (type){
                case 1:
                    if (p instanceof TypeDocuments){
                        result.add(p);
                    }
                    break;


                case 2:
                    if (p instanceof Typeproduct){
                        result.add(p);
                    }
                    break;
                case 3:
                    if (p instanceof Typeproduct){
                        result.add(p);
                    }
                    break;

            }
        }return result;
    }
}
