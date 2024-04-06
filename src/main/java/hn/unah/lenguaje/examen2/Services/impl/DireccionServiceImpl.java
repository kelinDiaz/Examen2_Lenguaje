package hn.unah.lenguaje.examen2.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguaje.examen2.Entities.Cliente;
import hn.unah.lenguaje.examen2.Entities.Direccion;
import hn.unah.lenguaje.examen2.Repositories.ClienteRepository;
import hn.unah.lenguaje.examen2.Repositories.DireccionRepository;
import hn.unah.lenguaje.examen2.Services.DireccionService;

@Service

public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository; 

    @Autowired
    private ClienteRepository clienteRepository; 
    @Override
    public Direccion crear(Direccion direccion, String dni) {
   

        Cliente cliente2 = this.clienteRepository.findById(dni).orElse(null);

        if (null != direccion.getCliente()) {
            cliente2 = direccion.getCliente();
            this.clienteRepository.save(cliente2);
            
        }

        direccion.setCliente(cliente2);

       
        Direccion direccion2 = this.direccionRepository.save(direccion);

        return direccion2;

    }
    
}
