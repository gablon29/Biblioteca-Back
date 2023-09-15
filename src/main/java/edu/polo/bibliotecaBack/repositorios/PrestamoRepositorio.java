package edu.polo.bibliotecaBack.repositorios;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.polo.bibliotecaBack.entidades.Estudiante;
import edu.polo.bibliotecaBack.entidades.Prestamo;

@Repository
public interface PrestamoRepositorio extends CrudRepository<Prestamo, Long>{
    
}
