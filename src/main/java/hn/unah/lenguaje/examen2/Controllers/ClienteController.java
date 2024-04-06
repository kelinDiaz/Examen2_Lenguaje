package hn.unah.lenguaje.examen2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguaje.examen2.Entities.Cliente;
import hn.unah.lenguaje.examen2.Services.impl.ClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;





@RestController
@RequestMapping("/api")
public class ClienteController {
   
    @Autowired
    private ClienteServiceImpl clienteServiceImpl; 



@PostMapping("/cliente/crear/{dni}")
public Cliente crearCliente(@RequestBody Cliente cliente, @PathVariable(name = "dni") String dni) {
    //TODO: process POST request
    return this.clienteServiceImpl.crearCliente(dni, cliente);
}


@GetMapping("cliente/obtener/{dni}")
public Cliente obtenerById(@PathVariable(name = "dni") String dni) {
    //TODO: process POST request
    
    return this.clienteServiceImpl.obtenerBydni(dni);
}

@GetMapping("cliente/obtenerTodos")
public List<Cliente> obtenerTodos() {
    return this.clienteServiceImpl.ObtenerClientes();
}

    
}
