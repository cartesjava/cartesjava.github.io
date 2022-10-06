---
title: "Présentation de l'approche"
weight: 20
bookCollapseSection: true
---

{{% pageTitle %}}

* Utiliser des cartes à jouer pour enseigner la programmation
* Développer un outil de validation pour
    * visualiser comment les données sont structurées dans un programme Java
        * p.ex. le code suivant
          ```java
          Carte[] tableauUn   = new Carte[6];
          Carte[] tableauDeux = new Carte[6];
          int indiceCarteCourante = 1;
          ```
        * peut se visualiser de la façon suivante:

          <center>
          <img class="figure" src="/approche/deux_tableaux.png" />
          </center>

        * où:
            * la première rangée de cartes est le `tableauUn`
            * la deuxième rangée de cartes est le `tableauDeux`
            * le point bleu indique la carte pointée par `indiceCarteCourante`

        
    * visualiser une procédure informatique (ou valider son implantation)
      * p.ex. voici une procédure naïve pour trier un tableau de cartes

          {{% animation "/approche/tri_naif.webm" %}}

      * à noter:
          * les variables utilisées dans le code sont affichées en bas à droite

    * explorer un concept à l'écran (ou avec des vraies cartes à jouer)
      * p.ex. l'outil permet de trier les cartes à l'écran

        {{% animation "/approche/tri_libre.webm" %}}

      * à noter:
          * `Est-ce trié?` devient `true` uniquement lorsque les cartes sont triées

## Exemple de tri

* Voici comment trier des cartes dans ce cours

* Il faut placer les cartes dans l'ordre ♡ ♢ ♧ ♤, puis de la plus petite à la plus grande pour chaque sorte
  * non-trié:

      <img class="figure" src="/approche/non_trie01.png"/>

  * trié par sorte:

      <img class="figure" src="/approche/trie_par_sorte01.png"/>

  * trié par sorte et numéro:

      <img class="figure" src="/approche/trie01.png"/>

* Si on a uniquement des cartes de ♡, on peut trier selon le numéro 
  * non-trié:

      <img class="figure" src="/approche/non_trie02.png"/>

  * trié par sorte et numéro:

      <img class="figure" src="/approche/trie02.png"/>

* Si on a des cartes de ♡ et de ♧, on va trier par sorte, puis numéro

  * non-trié:

      <img class="figure" src="/approche/non_trie03.png"/>

  * trié par sorte:

      <img class="figure" src="/approche/trie_par_sorte03.png"/>

  * trié par sorte et numéro:

      <img class="figure" src="/approche/trie03.png"/>

* Et ainsi de suite, en respectant l'ordre ♡ ♢ ♧ ♤


## En classe

En classe, on peut expliquer les concepts de ce manuel avec des cartes géantes (et des aimants pour les maintenir au tableau).

<img class="small-figure" src="/approche/trier/trier_par_sorte.jpg" />
<img class="small-figure" src="/approche/trier/trier_par_numero01.jpg" />
<img class="small-figure" src="/approche/trier/trier_par_numero03.jpg" />
<img class="small-figure" src="/approche/trier/trier_par_numero02.jpg" />

crédit photo: Mikael Tardif
