---
title: "Dessiner un graphe d'objets"
weight: 40
bookHidden: false
---

{{% pageTitle %}}

{{% video src="/3c6/etape2/module2/theorie/graphe/01.webm" %}}

1. Un modèle Java contient des références

    <img class="figure no-border" src="DrNo.svg"/>

    * Un `Personnage` apparaît dans plusieurs `Film`
    * Un `Film` contient plusieurs `Personnage`

1. Très souvent, ces références forment des boucles

    <img src="DrNo.png"/>

    * Le `Personnage` James Bond apparaît dans deux films: Dr. No et Bon Baisers de Russie
    * Le `Film` Dr. No contient deux personnages: James Bond et Dr. no

1. On parle alors de graphe d'objets (plutôt que de tableau d'objets)


## Graphe d'objets en JSON

{{% video src="/3c6/etape2/module2/theorie/graphe/02.webm" %}}

1. JSON n'a pas de notion de référence

1. Dans ce cours, on ajoute un objet spécial `{"_R":"/chemin/vers/objet/cible"}` pour représenter certaines références

    * (sans l'objet spécial, on ne peut pas représenter les boucles)

1. Par exemple, le graphe ci-haut est représenté comme suit en JSON

```json
{{% embed "DrNo.json" %}}
```

{{<excerpt class="note">}}
NOTE:

* on ne va pas vous demander d'écrire du JSON avec l'objet spécial `{"_R":"/chemin/cible"}`
* il vous faut uniquement comprendre que ça existe 
* et comprendre la notion de graphe d'objets en POO

{{</excerpt>}}

