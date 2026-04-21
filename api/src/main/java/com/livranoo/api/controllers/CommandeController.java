package com.livranoo.api.controllers;

import com.livranoo.api.models.Commande;
import com.livranoo.api.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commandes")
@CrossOrigin(origins = "http://localhost:4200") // Autorise Angular à appeler l'API
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;

    // Récupérer tous les colis
    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    // Ajouter un nouveau colis (utile pour tes tests)
    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeRepository.save(commande);
    }
}