package fr.simplex_software;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
public class PressReleaseApp
{
  public static void main(String[] args)
  {
    SpringApplication.run(PressReleaseApp.class, args);
  }
}
