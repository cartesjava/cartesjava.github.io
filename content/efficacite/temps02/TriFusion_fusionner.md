---
title: ""
weight: 1
bookHidden: true
---


`Tableau fusionner(Tableau gauche, Tableau droite)`:

* **CRÉER** un tableau `resultat` vide
* **TANT QUE** `gauche` n'est pas vide **ET QUE** `droite` n'est pas vide:
    * **SI** le premier élément de `gauche` est plus petit que le premier élément de `droite`:
        * **obtenir** le premier élément de `gauche`
        * **retirer** cet élément à `gauche`
        * **ajouter** cet élément à la fin de `resultat`
    * **SINON**
        * **obtenir** le premier élément de `droite`
        * **retirer** cet élément à `droite`
        * **ajouter** cet élément à la fin de `resultat`
* **SI** `gauche` n'est pas vide:
    * **retirer** chaque élément de `gauche` et les ajouter dans l'ordre à la fin de `resultat`
* **SINON**:
    * **retirer** chaque élément de `droite` et les ajouter dans l'ordre à la fin de `resultat`
* **retourner** le tableau `resultat`

