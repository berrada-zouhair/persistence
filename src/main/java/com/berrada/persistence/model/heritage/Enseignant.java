package com.berrada.persistence.model.heritage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("PROF")
public class Enseignant extends Personne {

  private String matiere;

  public Enseignant(Long id, String nom, Date dateNaissance, String matiere) {
    super(id, nom, dateNaissance);
    this.matiere = matiere;
  }

}
