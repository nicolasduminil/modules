package fr.simplex_software.data.repos;

import fr.simplex_software.commons.*;
import fr.simplex_software.jpa.*;
import org.springframework.data.jpa.repository.*;

public interface PressReleaseRepository extends JpaRepository<PressReleaseEntity, Long>, CustomPressReleaseRepository
{
}
