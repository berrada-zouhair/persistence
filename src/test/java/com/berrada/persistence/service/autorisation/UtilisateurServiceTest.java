package com.berrada.persistence.service.autorisation;

import com.berrada.persistence.model.autorisation.Groupe;
import com.berrada.persistence.model.autorisation.Utilisateur;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilisateurServiceTest {

  @Autowired
  UtilisateurService utilisateurService;

  @Test
  void should_associate_group_to_user() {
    Groupe groupe = new Groupe(null, "group1", Collections.emptyList());
    Utilisateur utilisateur = new Utilisateur(null, "user1", "password1", Collections.emptyList());
    Long userId = utilisateurService.saveUtilisateur(utilisateur).getId();
    Long groupId = utilisateurService.saveGroupe(groupe).getId();
    utilisateurService.associateUtlisateurToGroupe(userId, groupId);
    Optional<Groupe> groupe1 = utilisateurService.getGroup(groupId);
    Collection<Utilisateur> utilisateurs = groupe1.get().getUtilisateurs();
    System.out.println("=================================================");
    System.out.println("utilisateurs = " + utilisateurs);
  }
}
