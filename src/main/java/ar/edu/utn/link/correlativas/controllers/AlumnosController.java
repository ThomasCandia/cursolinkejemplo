package ar.edu.utn.link.correlativas.controllers;

import ar.edu.utn.link.correlativas.models.entities.Alumno;
import ar.edu.utn.link.correlativas.repositories.RepoAlumnos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {

  @Autowired
  RepoAlumnos repo;

  @GetMapping(path = {"","/"})
  public Page<Alumno> alumnos(Pageable pageable){
    return repo.alumnos(pageable);
  }
  @GetMapping("/{alumno}")
  public Alumno alumno(@PathVariable("alumno") String nombre){
    return repo.busquedaPorNombre(nombre);
  }

  @PostMapping("/")
  public String altaAlumno(@RequestBody @Valid Alumno alumno, BindingResult bindingResult){
    if(bindingResult.hasErrors()){
      return "not ok";
    } else {
      repo.save(alumno);
      return "ok";
    }
  }



}
