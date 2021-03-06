package fr.simplex_software.jpa;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name = "PRESS_RELEASE")
public class PressReleaseEntity
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long pressReleaseId;

  @NotEmpty
  private String pressReleaseName;

  @NotEmpty
  private String author;

  @NotEmpty
  private String publisher;

  public PressReleaseEntity()
  {
  }

  public PressReleaseEntity(String pressReleaseName, String author, String publisher)
  {
    super();
    this.pressReleaseName = pressReleaseName;
    this.author = author;
    this.publisher = publisher;
  }
}
