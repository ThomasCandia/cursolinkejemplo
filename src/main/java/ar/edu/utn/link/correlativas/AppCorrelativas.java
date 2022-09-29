package ar.edu.utn.link.correlativas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppCorrelativas {

  @Value("${algo}")
  private int numero;

  public static void main(String[] args) {
    SpringApplication.run(AppCorrelativas.class, args);
    }

  @Bean
  public CommandLineRunner ejemplo(){
    return (cosas) -> {
      System.out.println(numero);
    };
  }
  }