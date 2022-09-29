package ar.edu.utn.link.correlativas.controllerAdvice;

import ar.edu.utn.link.correlativas.exceptions.AlumnoRepetidoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(AlumnoRepetidoException.class)
  @ResponseBody
  @ResponseStatus(HttpStatus.CONFLICT)
  String alumnoRepetido(AlumnoRepetidoException exception){
    return "el alumno ya existe";
  }

}
