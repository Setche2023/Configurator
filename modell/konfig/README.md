## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Explications
## Propriétés :

- id : identifiant unique de l’utilisateur.
- name : nom de l’utilisateur.
- email : adresse e-mail de l’utilisateur, avec une validation du format.
- password : mot de passe avec une exigence minimale de longueur de 8 caractères.
- adresse : adresse de l’utilisateur.
- role : rôle de l’utilisateur (client ou administrateur).
- preferences : liste de préférences de l’utilisateur.
- historyOrdner : historique des commandes passées.

## Constructeur :

Initialise un utilisateur avec des valeurs valides, en appelant les méthodes setNom, setEmail et setMotDePasse pour s’assurer que les validations sont appliquées dès l’initialisation.
Méthodes principales :

- Inscription : méthode statique pour créer un nouvel utilisateur en vérifiant les critères de validité pour le nom, l’e-mail et le mot de passe.
- LogIn : vérifie si les informations de connexion (e-mail et mot de passe) sont correctes, sinon elle lève une exception.
- profilUpdate : permet de mettre à jour le nom, l’e-mail et l’adresse de l’utilisateur avec des vérifications de validité.
- addPreference : ajoute une préférence à l’utilisateur s’il ne l’a pas déjà.
- seeOrderHistory : retourne l’historique des commandes de l’utilisateur.

## Getters et Setters :

Ils incluent des validations pour s’assurer que les valeurs sont valides et respectent les exigences, par exemple, la vérification de l’e-mail via un modèle Regex.
Gestion des erreurs :

Des exceptions sont levées avec IllegalArgumentException ou Exception si une condition n’est pas remplie, ce qui garantit une gestion d’erreur pour les entrées utilisateur.
Gestion des erreurs
Chaque méthode ou setter utilise des conditions pour vérifier les entrées. Si une entrée est invalide, une exception est levée pour signaler le problème. Par exemple :

Nom vide : Si le nom est vide, une IllegalArgumentException est levée.
E-mail invalide : Si l’e-mail ne correspond pas au modèle d’expression régulière, une IllegalArgumentException est également levée.
Mot de passe : Si le mot de passe a moins de 8 caractères, une IllegalArgumentException est levée.