package ar.edu.utn.link.correlativas.repositories;

import ar.edu.utn.link.correlativas.models.entities.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "alumnos")
public interface RepoAlumnosJPA extends JpaRepository<Alumno,Integer> {


  @Override
  @RestResource(exported = false)
  void deleteById(Integer id);

  @Override
  @RestResource(exported = false)
  void delete(Alumno id);

  public Page<Alumno> findAlumnoByNombre(String nombre);

}
