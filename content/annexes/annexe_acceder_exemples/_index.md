---
title: "Annexe 2: accéder aux exemples"
bookCollapseSection: false
bookNumbering: false
weight: 150
---

{{% pageTitle %}}

## Préalables

* JDK 11 ou plus récent (testé jusqu'à JDK18)
* Git
* Eclipse

## Cloner les sources

Dans un GitBash (ou à la console en Linux ou Mac)

```bash
$ git clone https://github.com/cartesjava/ca.ntro.cards.git
```

## Exécuter `deplacer_decaler`

Dans un GitBash à la racine du dépôt git `ca.ntro.cards`

```bash
$ sh gradlew shift_solution:generer    # pour générer les cas de tests
$ sh gradlew shift_solution:procedure  # pour lancer l'outil de validation
```

Utiliser l'outil de validation pour sélectionner le cas de test qui vous intéresse.

Le modèle en JSON sera dans&nbsp;:

* `solutions/shift_solution/_storage/models`

Le graphe d'objets sera dans&nbsp;:

* `solutions/shift_solution/_storage/graphs`

## Exécuter `fibonacci`

```bash
$ sh gradlew fibonacci_solution:generer    # pour générer les cas de tests
$ sh gradlew fibonacci_solution:procedure  # pour lancer l'outil de validation
```

Utiliser l'outil de validation pour sélectionner le cas de test qui vous intéresse.

Le modèle en JSON sera dans&nbsp;:

* `solutions/fibonacci_solution/_storage/models`

Le graphe d'objets sera dans&nbsp;:

* `solutions/fibonacci_solution/_storage/graphs`

## Exécuter `validator_cartesjava` 

```bash
$ sh gradlew validator_cartesjava_solution:generer   # pour générer les cas de tests
$ sh gradlew validator_cartesjava_solution:valider   # pour valider les modèles
```

Utiliser l'outil de validation pour sélectionner le cas de test qui vous intéresse.

Les modèles en JSON seront dans&nbsp;:

* `solutions/validator_cartesjava_solution/_storage/models`

Les graphes d'objets seront dans&nbsp;:

* `solutions/validator_cartesjava_solution/_storage/graphs`

## Modifier une solution

Générer les projets Eclipse avec

```bash
$ sh gradlew eclipse
```

Importer les projets en Eclipse afin de modifier le code

En particulier&nbsp;:

* Dans chaque projet `_solution`, modifier le modèle, p.ex. 
    * pour `deplacer_decaler`&nbsp;: `MonTableau` 
    * pour `fibonacci`&nbsp;: `MonCalculateur`
    * pour `validator_cartesjava`&nbsp;: les classes du paquet `models`

