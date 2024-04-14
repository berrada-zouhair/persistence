package com.berrada.persistence.repository.ecole;

import com.berrada.persistence.model.ecole.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
