---
title: "Utilisation de cartes à jouer"
weight: 22
---

{{% pageTitle %}}

## Exemple: déplacer/décaler

On veut implanter les deux opérations suivantes dans un tableau de carte

1. déplacer une carte au début, en décalant vers la droite pour faire de la place:

    {{% animation 
        "/approche/cartes_a_jouer/deplacer_debut.webm" 
    %}}

2. déplacer une carte à la fin, en décalant vers la gauche pour faire de la place:

    {{% animation 
        "/approche/cartes_a_jouer/deplacer_fin.webm" 
    %}}

<br>

{{<excerpt class="note">}}
**NOTE**: on peut prendre n'importe quelles cartes pour illustrer ces opérations.
{{</excerpt>}}

## Visualisation du code


1. On va visualiser le code suivant

    ```java
    Carte[] cartes;

    int aDeplacer;
    int i;

    Carte memoireA;
    Carte memoireB;
    ```

    <img class="figure" src="visualisation.png"/>

{{<excerpt class="note max-width-75">}}
Une carte blanche représente une case vide (valeur `null`)
{{</excerpt>}}


## Procédure: déplacer au début

Pour déplacer une carte au début, on va utiliser la procédure suivante

{{% animation 
    "/approche/cartes_a_jouer/procedure_deplacer_debut.webm" 
%}}

* D'abord, mémoriser la carte à déplacer dans `memoireA`
* Ensuite, faire une boucle `for` pour visiter le bonnes cases du tableau
    * pour chaque case visitée
        * mémoriser la carte courante dans `memoireB`
        * «monter» les cartes mémorisées:
            * «monter» `memoireA` dans le tableau
            * «monter» `memoireB` dans `memoireA`

<br>


{{<excerpt class="note max-width-75">}}
* il y a une autre procédure qui utilise une seul case mémoire
* (Chut! Ne le dis pas, c'est une question bonus de l'atelier!)
{{</excerpt>}}

## Procédure: déplacer à la fin


Pour déplacer une carte à la fin, on va utiliser la procédure suivante

{{% animation 
    "/approche/cartes_a_jouer/procedure_deplacer_fin.webm" 
%}}

* D'abord, mémoriser la carte à déplacer dans `memoireA`
* Ensuite, faire une boucle `for` pour visiter les bonnes cases du tableau
    * pour chaque case visitée
        * déplacer la carte suivante à la case courante
* Finalement, déplacer la carte mémorisée à la fin du tableau



        


