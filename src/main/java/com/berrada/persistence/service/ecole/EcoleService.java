package com.berrada.persistence.service.ecole;

import com.berrada.persistence.model.ecole.Cours;
import com.berrada.persistence.model.ecole.Etudiant;
import com.berrada.persistence.model.ecole.Inscription;
import com.berrada.persistence.repository.ecole.CoursRepository;
import com.berrada.persistence.repository.ecole.EtudiantRepository;
import com.berrada.persistence.repository.ecole.InscriptionRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EcoleService {

  private CoursRepository coursRepository;
  private EtudiantRepository etudiantRepository;
  private InscriptionRepository inscriptionRepository;

  public Etudiant saveEtudiant(Etudiant etudiant) {
    return etudiantRepository.save(etudiant);
  }

  public Cours saveCours(Cours cours) {
    return coursRepository.save(cours);
  }

  public Inscription saveInscription(Inscription inscription) {
    return inscriptionRepository.save(inscription);
  }

  public Optional<Inscription> findInscription(Long inscriptionId) {
    return inscriptionRepository.findById(inscriptionId);
  }

}
