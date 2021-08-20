package fr.simplex_software.data.repos;

import fr.simplex_software.commons.CustomPressReleaseRepository;
import fr.simplex_software.jpa.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

public interface PressReleaseRepository extends JpaRepository<PressReleaseEntity, Long>, CustomPressReleaseRepository
{
}
