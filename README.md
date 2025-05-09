# Projet de Gestion d'Articles et de Commentaires

## Aperçu
Ce projet est une API RESTful permettant de gérer des articles et leurs commentaires. Il utilise Spring Boot et Swagger pour la documentation des endpoints. L'API permet d'effectuer des opérations telles que l'ajout, la liste, la modification et la suppression d'articles et de commentaires.

## Technologies Utilisées
- **Java 11** ou supérieur
- **Spring Boot** : Framework pour construire l'API
- **Swagger/OpenAPI** : Documentation des endpoints
- **JUnit** : Tests unitaires et d'intégration


## Endpoints de l'API

### Article Controller

#### 1. Ajouter un article

- **URL** : `/api/v1/articles`
- **Méthode HTTP** : `POST`
- **Description** : Ajoute un nouvel article.
- **Corps de la requête** :
  ```json
  {
    "title": "Titre de l'article",
    "content": "Contenu de l'article"
  }
  
### 2. Récupérer la liste des articles

- **URL** :  `/api/v1/articles`
- **Méthode HTTP** : `GET`
- **Description** : Récupère tous les articles.

### 3. Récupérer un article par ID

- **URL** : /api/v1/articles/{id}
Méthode HTTP : GET
Description : Récupère un article spécifique par son ID.

### 4. Modifier un article

- **URL** : `/api/v1/articles/{id}`
- **Méthode HTTP** : `PUT`
- **Description** : Met à jour un article existant.
Corps de la requête :

{
  "title": "Nouveau titre",
  "content": "Nouveau contenu"
}

### 5. Supprimer un article

- **URL** : /api/v1/articles/{id}
- **Méthode HTTP** : DELETE
- **Description** : Supprime un article par son ID.

### Commentaire Controller

#### 1. Ajouter un commentaire

- **URL** : /api/articles/commentaires
- **Méthode HTTP** : POST
- **Description** : Ajoute un commentaire à un article.

   Paramètres :
  articleId : ID de l'article
  Corps de la requête :
  
  {
    "content": "Contenu du commentaire"
  }
#### 2. Récupérer la liste des commentaires

- **URL** : /api/articles/commentaires
 - **Méthode HTTP** : GET
 - **Description** : Récupère tous les commentaires.
   
#### 3. Récupérer un commentaire par ID

- **URL** : /api/articles/commentaires/{id}
 - **Méthode HTTP** : GET
 - **Description** : Récupère un commentaire spécifique par son ID.
   
 #### 4. Modifier un commentaire
 
- **URL** : /api/articles/commentaires/update/{id}
   - **Méthode HTTP** : PUT
 - **Description** : Met à jour un commentaire existant.
  Corps de la requête :
  
  {
    "content": "Nouveau contenu du commentaire"
  }
  #### 5. Supprimer un commentaire
  
 - **URL** : /api/articles/commentaires/{id}
    - **Méthode HTTP** : DELETE
  - **Description** : Supprime un commentaire par son ID.
 
  
  ### Installation
  Clonez le dépôt :
  
  ````bash
  git clone https://github.com/votre-utilisateur/blogmanagment.git
````
  Accédez au répertoire :
  ````bash
  cd blogmanagment
````
  Configurez votre fichier application.properties pour connecter une base de données.
  
  Compilez et lancez l'application :
  ```bash
  ./mvnw spring-boot:run
  L'API sera accessible à l'adresse suivante : http://localhost:8080/api/v1/articles
```
  
  Contribution
  Les contributions sont les bienvenues ! Pour contribuer :
  
  Forkez ce dépôt.
  Créez une branche pour vos modifications :
  ```bash
  git checkout -b ajout-de-fonctionnalite
```
  Poussez vos modifications et soumettez une Pull Request.
  Auteurs
   dilane56
