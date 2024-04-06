package hn.unah.lenguaje.examen2.Services;

import hn.unah.lenguaje.examen2.Entities.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente  crearCliente( String dni ,Cliente cliente);

    public List<Cliente> ObtenerClientes();

    public Cliente obtenerBydni (String dni); 



    
}
