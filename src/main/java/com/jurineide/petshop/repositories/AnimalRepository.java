package com.jurineide.petshop.repositories;

import com.jurineide.petshop.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
