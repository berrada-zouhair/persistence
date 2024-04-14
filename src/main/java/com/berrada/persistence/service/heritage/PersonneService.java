package com.berrada.persistence.service.heritage;

import com.berrada.persistence.model.heritage.Personne;
import com.berrada.persistence.repository.heritage.PersonneRepository;
import java.util.Collection;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonneService {

  private PersonneRepository personneRepository;
  public Personne save(Personne personne) {
    return personneRepository.save(personne);
  }

  public Collection<Personne> getAll() {
    return personneRepository.findAll();
  }
}
