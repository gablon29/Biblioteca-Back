package edu.polo.bibliotecaBack.repositorios;

import edu.polo.bibliotecaBack.entidades.*;
import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends CrudRepository<Estudiante, Long>{
}
