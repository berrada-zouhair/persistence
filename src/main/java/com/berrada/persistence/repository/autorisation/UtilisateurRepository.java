package com.berrada.persistence.repository.autorisation;

import com.berrada.persistence.model.autorisation.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
