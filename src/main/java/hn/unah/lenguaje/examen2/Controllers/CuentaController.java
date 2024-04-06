package hn.unah.lenguaje.examen2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguaje.examen2.Entities.Cuentas;
import hn.unah.lenguaje.examen2.Services.impl.CuentaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class CuentaController {


    @Autowired
    private CuentaServiceImpl cuentaServiceImpl; 

    @PostMapping("/cuenta/crear/{numeroCuenta}")
    public Cuentas crear(@RequestBody Cuentas cuentas, @PathVariable String numeroCuenta) {
        //TODO: process POST request
        
        return this.cuentaServiceImpl.crearCuenta(cuentas, numeroCuenta);
    }
    
    
}
