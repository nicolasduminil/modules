package fr.simplex_software.commons;

import fr.simplex_software.jpa.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;

//@NoRepositoryBean
public interface CustomPressReleaseRepository
{
  PressReleaseEntity findOne();
}
