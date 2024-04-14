package com.berrada.persistence.model.ecole;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Inscription {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date date;

  private int score;

  @ManyToOne(fetch = FetchType.EAGER)
  private Cours cours;

  @ManyToOne(fetch = FetchType.EAGER)
  private Etudiant etudiant;

  @Override
  public String toString() {
    return "Inscription{" +
        "id=" + id +
        ", date=" + date +
        ", score=" + score +
        ", cours=" + cours.getNom() +
        ", etudiant=" + etudiant.getNom() +
        '}';
  }
}
