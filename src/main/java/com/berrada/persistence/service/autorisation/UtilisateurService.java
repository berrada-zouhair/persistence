package com.berrada.persistence.service.autorisation;

import com.berrada.persistence.model.autorisation.Groupe;
import com.berrada.persistence.model.autorisation.Utilisateur;
import com.berrada.persistence.repository.autorisation.GroupeRepository;
import com.berrada.persistence.repository.autorisation.UtilisateurRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UtilisateurService {

  private UtilisateurRepository utilisateurRepository;
  private GroupeRepository groupeRepository;

  public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
    return utilisateurRepository.save(utilisateur);
  }

  public Groupe saveGroupe(Groupe groupe) {
    return groupeRepository.save(groupe);
  }

  public void associateUtlisateurToGroupe(Long utilisateurId, Long groupeId) {
    Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId).get();
    Groupe groupe = groupeRepository.findById(groupeId).get();
    groupe.getUtilisateurs().add(utilisateur);
    groupeRepository.save(groupe);
  }

  public Optional<Groupe> getGroup(Long groupId) {
    return groupeRepository.findById(groupId);
  }
}
