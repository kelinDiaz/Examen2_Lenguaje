package hn.unah.lenguaje.examen2.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguaje.examen2.Entities.Cuentas;
import hn.unah.lenguaje.examen2.Repositories.CuentaRepository;
import hn.unah.lenguaje.examen2.Services.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository; 

@Override
public Cuentas crearCuenta(Cuentas cuenta, String numeroCuenta) {
    if (this.cuentaRepository.existsById(numeroCuenta)) {
      
        return null; 
    } else {
        
        return this.cuentaRepository.save(cuenta);
    }
}
    
}
