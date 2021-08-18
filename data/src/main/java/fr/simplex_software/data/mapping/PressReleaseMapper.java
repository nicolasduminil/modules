package fr.simplex_software.data.mapping;

import fr.simplex_software.jpa.*;
import fr.simplex_software.model.*;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PressReleaseMapper
{
  @Mappings({@Mapping(source = "pressReleaseName", target = "name")})
  PressRelease toPressRelease(PressReleaseEntity PressReleaseEntity);
  @InheritInverseConfiguration
  PressReleaseEntity fromPressRelease(PressRelease PressRelease);
}
