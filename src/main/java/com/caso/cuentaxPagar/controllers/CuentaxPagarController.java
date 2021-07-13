package com.caso.cuentaxPagar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caso.cuentaxPagar.services.CuentaxPagarService;
import com.caso.cuentaxPagar.models.CuentaxPagar;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/cuentaxPagar"})


public class CuentaxPagarController {
    @Autowired
    CuentaxPagarService cuentaxPagarService;

    @GetMapping
    public ResponseEntity<List<CuentaxPagar>>listar(){
        List<CuentaxPagar> cuentaxPagar = cuentaxPagarService.listCuentaxPagar();
        return new ResponseEntity<List<CuentaxPagar>>(cuentaxPagar,HttpStatus.OK);
    }


}
