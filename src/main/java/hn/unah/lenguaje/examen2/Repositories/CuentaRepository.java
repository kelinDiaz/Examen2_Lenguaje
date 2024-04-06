package hn.unah.lenguaje.examen2.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguaje.examen2.Entities.Cuentas;

public interface CuentaRepository extends CrudRepository<Cuentas ,String> {
    
}
