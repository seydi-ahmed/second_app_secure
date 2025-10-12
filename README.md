# API REST d’authentification et de gestion d’utilisateurs, sécurisée avec Spring Security et JWT

---

## Détails du projet

| 🔢 **Projet**                                    | 🧭 **Objectif principal**                               | 🧠 **Compétences & notions clés**                                                                                                                | 🧰 **Technologies / outils**                                         | 🎯 **Résultat attendu**                                                            |
| ------------------------------------------------ | ------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| **2️⃣ API sécurisée avec JWT**                   | Ajouter authentification & autorisation                 | - Spring Security<br>- JWT<br>- BCrypt PasswordEncoder<br>- Rôles et permissions<br>- Stateless Auth                                             | Spring Security, JWT, Postman, Lombok                                | Une API REST sécurisée (ex : Auth / Login / Register / Profile)                    |

---

## 🎯 Objectif

Construire une API stateless (sans session côté serveur) où :
- Un utilisateur peut s’inscrire (/api/auth/register)
- Un utilisateur peut se connecter (/api/auth/login)
- L’API renvoie un token JWT
- Les routes privées (ex. /api/users/profile) ne sont accessibles que si le token est valide
- Il y a des rôles (par exemple ROLE_USER, ROLE_ADMIN) pour gérer les autorisations.

---

## Endpoints

| Endpoint             | Méthode | Description                                  | Auth requise   |
| -------------------- | ------- | -------------------------------------------- | -------------- |
| `/api/auth/register` | `POST`  | Inscription d’un utilisateur                 | ❌              |
| `/api/auth/login`    | `POST`  | Authentification, retourne un JWT            | ❌              |
| `/api/users/profile` | `GET`   | Récupère le profil de l’utilisateur connecté | ✅              |
| `/api/users/all`     | `GET`   | Liste des utilisateurs (admin seulement)     | ✅ (ROLE_ADMIN) |

---

## 🧱 Technologies principales

| Catégorie                   | Outil / Lib                  |
| --------------------------- | ---------------------------- |
| **Framework**               | Spring Boot                  |
| **Sécurité**                | Spring Security              |
| **Authentification**        | JWT (JSON Web Token)         |
| **Hashage de mot de passe** | BCrypt                       |
| **ORM**                     | Spring Data JPA + PostgreSQL |
| **Libs pratiques**          | Lombok                       |
| **Test / Démo**             | Postman                      |
