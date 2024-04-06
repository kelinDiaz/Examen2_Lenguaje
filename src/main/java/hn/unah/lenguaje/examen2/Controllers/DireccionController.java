package hn.unah.lenguaje.examen2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguaje.examen2.Entities.Direccion;
import hn.unah.lenguaje.examen2.Services.impl.DireccionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class DireccionController {

    @Autowired
    private DireccionServiceImpl direccionServiceImpl; 

    @PostMapping("/direccion/crear/{dni}")
    public Direccion crearDireccion (@PathVariable String dni ,@RequestBody Direccion direccion) {
       
        
        return this.direccionServiceImpl.crear(direccion, dni);
    }
    
    
}
