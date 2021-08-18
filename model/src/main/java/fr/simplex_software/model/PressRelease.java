package fr.simplex_software.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PressRelease
{
  private Long pressReleaseId;
  private String name;
  private String author;
  private String publisher;

  public PressRelease(String name, String author, String publisher)
  {
    this.name = name;
    this.author = author;
    this.publisher = publisher;
  }
}
