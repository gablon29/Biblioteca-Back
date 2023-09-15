package edu.polo.bibliotecaBack.repositorios;

import edu.polo.bibliotecaBack.entidades.*;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends CrudRepository<Libro, Long> {
   

}
