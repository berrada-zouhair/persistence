package com.berrada.persistence.service.ecole;

import static java.util.Collections.emptyList;

import com.berrada.persistence.model.ecole.Cours;
import com.berrada.persistence.model.ecole.Etudiant;
import com.berrada.persistence.model.ecole.Inscription;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcoleServiceTest {

  @Autowired
  EcoleService ecoleService;

  @Test
  void should_create_inscription() {
    Cours cours = ecoleService.saveCours(new Cours(null, "java", 20, emptyList()));
    Etudiant etudiant = ecoleService.saveEtudiant(
        new Etudiant(null, "zouhair", "berrada", emptyList())
    );
    Inscription inscription = ecoleService.saveInscription(
        new Inscription(null, new Date(), 50, cours, etudiant)
    );
    Inscription inscription1 = ecoleService.findInscription(inscription.getId()).get();
    System.out.println("====================");
    System.out.println("inscription1 = " + inscription1);


  }
}
