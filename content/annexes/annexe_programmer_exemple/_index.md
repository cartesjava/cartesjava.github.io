---
title: "Annexe 3: programmer un nouvel exemple"
bookCollapseSection: false
bookNumbering: false
weight: 200
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

## Créer un nouveau projet

Pour créer une nouvelle visualisation avec les cartes:

```bash
$ sh scripts/new_project.sh MonProjet mon_projet
```

Pour créer un nouveau validateur:


```bash
$ sh scripts/new_validator.sh MesModeles mes_modeles
```

## Créer et importer les projets Eclipse

Générer les projets Eclipse avec

```bash
$ sh gradlew eclipse
```

Importer les projets en Eclipse 

## Modifier la visualisation avec les cartes

S'inspirer des projets `shift_procedure` et `fibonacci_procedure`

Dans le projet `mon_projet_procedure`, modifier le paquet `models`

Renommer au besoin la classe `MonProjetCardsModel`

Implanter les méthodes marquées d'un `TODO` et que l'outil de validation utilise:

* `copyDataFrom`: copier les données d'un autre modèle
* `compareToSolution`: valider si le modèle courant est une solution
* `updateViewDataImpl`: afficher les cartes correspondant au modèle courant
* `initializeAsTestCase`: données de départ d'un cas de test

Finalement, modifier aussi  `test_cases.MonProjetTestCaseDatabase`, en particulier:

* `describeTestCasesToGenerate`: faire la liste des cas de tests à générer


## Ajouter des modèles à un validateur

Dans le projet `validator_mes_modeles`, modifier le paquet `models`

S'inspirer de `Model01` et `Model01SuperClass` pour voir comment créer un nouveau modèle

Ne pas oublier d'implanter la méthode `copyDataFrom` qui est utilisé par l'outil copier un modèle.

