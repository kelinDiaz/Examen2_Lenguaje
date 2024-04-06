package hn.unah.lenguaje.examen2.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguaje.examen2.Entities.Movimientos;

public interface MovimientoRepository extends CrudRepository<Movimientos, Integer> {
    
}
