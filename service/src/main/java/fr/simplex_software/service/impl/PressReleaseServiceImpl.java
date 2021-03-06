package fr.simplex_software.service.impl;

import fr.simplex_software.data.mapping.*;
import fr.simplex_software.data.repos.*;
import fr.simplex_software.jpa.*;
import fr.simplex_software.model.*;
import fr.simplex_software.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import java.util.*;
import java.util.stream.*;

@Service
@Transactional
public class PressReleaseServiceImpl implements PressReleaseService
{
  private PressReleaseRepository pressReleaseRepository;
  private PressReleaseMapper pressReleaseMapper;

  @Autowired
  public PressReleaseServiceImpl(PressReleaseRepository pressReleaseRepository, PressReleaseMapper pressReleaseMapper)
  {
    this.pressReleaseRepository = pressReleaseRepository;
    this.pressReleaseMapper = pressReleaseMapper;
  }

  @Override
  public Optional<PressRelease> getPressReleaseById(int pressReleaseId)
  {
    return Optional.empty();
  }

  @Override
  public List<PressRelease> getPressReleases()
  {
    return pressReleaseRepository.findAll().parallelStream().map(pressReleaseEntity -> pressReleaseMapper.toPressRelease(pressReleaseEntity)).collect(Collectors.toList());
  }

  @Override
  public boolean deletePressReleaseById(int pressReleaseId)
  {
    return false;
  }

  @Override
  public Optional<PressRelease> saveOrUpdatePressRelease(PressRelease pressRelease)
  {
    if (pressRelease.getPressReleaseId() == 0 || pressReleaseRepository.existsById(pressRelease.getPressReleaseId()))
    {
      PressReleaseEntity pressReleaseEntity = pressReleaseRepository.save(pressReleaseMapper.fromPressRelease(pressRelease));
      return Optional.of(pressReleaseMapper.toPressRelease(pressReleaseEntity));
    }
    else
    {
      return Optional.empty();
    }
  }
}
