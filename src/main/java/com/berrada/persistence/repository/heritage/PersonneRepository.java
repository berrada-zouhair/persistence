package com.berrada.persistence.repository.heritage;

import com.berrada.persistence.model.heritage.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
