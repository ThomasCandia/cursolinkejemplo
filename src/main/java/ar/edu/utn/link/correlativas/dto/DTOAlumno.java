package ar.edu.utn.link.correlativas.dto;

import ar.edu.utn.link.correlativas.models.entities.Alumno;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "alumno1", types = {Alumno.class})
public interface DTOAlumno {

  @Value("#{target.nombre}")
  String getNombreCompleto();

}
