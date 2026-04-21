package com.livranoo.api.repositories;

import com.livranoo.api.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // Magique : Spring Boot génère tout le code SQL pour toi !
}