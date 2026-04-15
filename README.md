# 📦 Livranoo - Solution d'Optimisation de Tournées

**Livranoo** est une application full-stack conçue pour optimiser la gestion des livraisons du "dernier kilomètre". Ce projet a été développé dans le cadre de ma formation de **Concepteur Développeur d'Applications (CDA)**.

## 🚀 Le Projet
L'objectif est de fournir aux livreurs un outil capable de visualiser leurs points de passage, de gérer les priorités des colis et de valider les étapes de leur tournée en temps réel.

## 🛠️ Stack Technique
- **Backend :** Java 17, Spring Boot 3, Spring Security (JWT), Spring Data JPA.
- **Frontend :** Angular 17, Leaflet (Cartographie), Tailwind CSS.
- **Base de données :** MySQL.
- **Déploiement :** Docker, Render / Clever Cloud.

## 🌟 Fonctionnalités Clés
- **Authentification sécurisée :** Gestion des rôles (Admin / Livreur).
- **Gestion des tournées :** Calcul de l'ordre de passage selon l'urgence.
- **Interface Mobile-First :** Carte interactive pour le suivi GPS.
- **Traçabilité :** Horodatage précis des livraisons (Heure prévue vs Heure réelle).

## 🔧 Installation locale
1. Cloner le dépôt : `git clone https://github.com/SylvieHoareau/livranoo.git`
2. Configurer la base de données dans `backend/src/main/resources/application.properties`.
3. Lancer le backend : `mvn spring-boot:run`
4. Lancer le frontend : `npm install` puis `ng serve`

## 👤 Auteur
- **Sylvie HOAREAU** - Apprenante CDA
