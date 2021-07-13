package com.caso.cuentaxPagar.services;
import com.caso.cuentaxPagar.models.CuentaxPagar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.caso.cuentaxPagar.repositories.CuentaxPagarRepository;

import java.util.List;
@Service

public class CuentaxPagarService {
    @Autowired
    CuentaxPagarRepository cuentaxPagarRepository;

    public List<CuentaxPagar> listCuentaxPagar(){ return cuentaxPagarRepository.findAll(); }


}
