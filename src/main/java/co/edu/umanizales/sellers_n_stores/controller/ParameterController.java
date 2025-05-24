package co.edu.umanizales.sellers_n_stores.controller;


import co.edu.umanizales.sellers_n_stores.model.Parameter;
import co.edu.umanizales.sellers_n_stores.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="/parameter" )
public class ParameterController {
    @Autowired
    private ParameterService parameterService;


    @GetMapping(path = "/typedocuments")
    public List<Parameter> getTypesDocuments(){return parameterService.getParametersByType(1);}
    @GetMapping
    public List<Parameter> getTypesProducts(){return parameterService.getParametersByType(2);}
}
