package fr.simplex_software.commons;

import fr.simplex_software.jpa.*;
import org.springframework.data.domain.*;

import java.util.*;

public class CustomJpaRepositoryImpl implements CustomJpaRepository
{
  @Override
  public List<PressReleaseEntity> findAll()
  {
    return null;
  }

  @Override
  public List<PressReleaseEntity> findAll(Sort sort)
  {
    return null;
  }

  @Override
  public Page<PressReleaseEntity> findAll(Pageable pageable)
  {
    return null;
  }

  @Override
  public List<PressReleaseEntity> findAllById(Iterable<Long> iterable)
  {
    return null;
  }

  @Override
  public long count()
  {
    return 0;
  }

  @Override
  public void deleteById(Long aLong)
  {

  }

  @Override
  public void delete(PressReleaseEntity pressReleaseEntity)
  {

  }

  @Override
  public void deleteAllById(Iterable<? extends Long> iterable)
  {

  }

  @Override
  public void deleteAll(Iterable<? extends PressReleaseEntity> iterable)
  {

  }

  @Override
  public void deleteAll()
  {

  }

  @Override
  public <S extends PressReleaseEntity> S save(S s)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> List<S> saveAll(Iterable<S> iterable)
  {
    return null;
  }

  @Override
  public Optional<PressReleaseEntity> findById(Long aLong)
  {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong)
  {
    return false;
  }

  @Override
  public void flush()
  {

  }

  @Override
  public <S extends PressReleaseEntity> S saveAndFlush(S s)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> List<S> saveAllAndFlush(Iterable<S> iterable)
  {
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<PressReleaseEntity> iterable)
  {

  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> iterable)
  {

  }

  @Override
  public void deleteAllInBatch()
  {

  }

  @Override
  public PressReleaseEntity getOne(Long aLong)
  {
    return null;
  }

  @Override
  public PressReleaseEntity getById(Long aLong)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> Optional<S> findOne(Example<S> example)
  {
    return Optional.empty();
  }

  @Override
  public <S extends PressReleaseEntity> List<S> findAll(Example<S> example)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> List<S> findAll(Example<S> example, Sort sort)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> Page<S> findAll(Example<S> example, Pageable pageable)
  {
    return null;
  }

  @Override
  public <S extends PressReleaseEntity> long count(Example<S> example)
  {
    return 0;
  }

  @Override
  public <S extends PressReleaseEntity> boolean exists(Example<S> example)
  {
    return false;
  }

  @Override
  public PressReleaseEntity findOne()
  {
    return null;
  }
}
