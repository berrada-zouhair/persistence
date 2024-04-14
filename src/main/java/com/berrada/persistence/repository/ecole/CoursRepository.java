package com.berrada.persistence.repository.ecole;

import com.berrada.persistence.model.ecole.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {

}
