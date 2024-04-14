package com.berrada.persistence.repository.ecole;

import com.berrada.persistence.model.ecole.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

}
