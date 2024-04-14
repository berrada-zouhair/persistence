package com.berrada.persistence.model.sante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class RendezVous {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Temporal(TemporalType.DATE)
  private Date date;

  @ManyToOne
  @JoinColumn(name = "medecin")
  private Medecin medecin;

  @ManyToOne
  @JoinColumn(name = "patient")
  private Patient patient;

  //  @OneToOne(mappedBy = "rendezVous")
  @OneToOne
  @JoinColumn(name = "consultation")
  Consultation consultation;

}
