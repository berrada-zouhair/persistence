package com.berrada.persistence.service.heritage;

import com.berrada.persistence.model.heritage.Eleve;
import com.berrada.persistence.model.heritage.Enseignant;
import com.berrada.persistence.model.heritage.Personne;
import java.util.Collection;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonneServiceTest {

  @Autowired
  PersonneService personneService;

  @Test
  void should_save_enseignant_and_eleve() {
    Personne amine = new Eleve(null, "amine", new Date(), 15);
    Personne enseignant = new Enseignant(null, "kamal", new Date(), "IT");
    personneService.save(amine);
    personneService.save(enseignant);
    Collection<Personne> all = personneService.getAll();
    System.out.println("all = " + all);
  }
}
