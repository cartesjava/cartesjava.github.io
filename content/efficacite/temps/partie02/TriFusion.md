---
title: ""
weight: 1
bookHidden: true
---


`Tableau trier(Tableau entree)`:

* **CRÉER** un tableau `resultat` vide
* **SI** `entree` contient un seul élément ou moins:
    * **copier** `entree` dans `resultat`
* **SINON**:
    * **diviser** le tableau `entree` en deux sous-tableaux égaux
    * **appeler** `trier()` pour trier chaque sous-tableau
    * **appeler** `fusionner()` pour fusionner les deux sous-tableaux
    * **copier** le tableau fusionné dans `resultat`
* **retourner** le tableau `resultat`
