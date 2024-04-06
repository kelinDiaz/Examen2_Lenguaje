package hn.unah.lenguaje.examen2.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguaje.examen2.Entities.Cliente;
import hn.unah.lenguaje.examen2.Repositories.ClienteRepository;
import hn.unah.lenguaje.examen2.Services.ClienteService;



@Service
public class ClienteServiceImpl implements ClienteService{
 

    @Autowired
    private ClienteRepository clienteRepository; 
    

    @Override
    public List<Cliente> ObtenerClientes() {
        // TODO Auto-generated method stub
        return (List<Cliente>)this.clienteRepository.findAll();
    }
@Override
public Cliente crearCliente(String dni, Cliente cliente) {

    if (this.clienteRepository.existsById(dni)) {
      
        return null; 
    } else {
        
        return this.clienteRepository.save(cliente);
    }
}

    @Override
    public Cliente obtenerBydni(String dni) {
        // TODO Auto-generated method stub
        return this.clienteRepository.findById(dni).get();
    }

}