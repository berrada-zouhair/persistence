package com.berrada.persistence.model.heritage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
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
@DiscriminatorValue("ETU")
public class Eleve extends Personne {

  private int note;

  public Eleve(Long id, String nom, Date dateNaissance, int note) {
    super(id, nom, dateNaissance);
    this.note = note;
  }
}
