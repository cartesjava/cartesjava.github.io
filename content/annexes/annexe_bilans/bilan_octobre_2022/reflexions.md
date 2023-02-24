---
title: "Bilan octobre 2022 ; réflexions"
weight: 1
# bookFlatSection: false
# bookToc: true
# bookHidden: false
# bookCollapseSection: true
# bookComments: false
# bookSearchExclude: false
draft : true
bookHidden: true
---


## Impressions et réflexions


### Ce qui fonctionne bien

1. C'est très agréable d'utiliser les cartes surdimensionnées pour expliquer une procédure au tableau blanc&nbsp;:

    <img class="small-figure" src="/approche/trier/trier_par_sorte.jpg" />
    <img class="small-figure" src="/approche/trier/trier_par_numero01.jpg" />
    <img class="small-figure" src="/approche/trier/trier_par_numero03.jpg" />
    <img class="small-figure" src="/approche/trier/trier_par_numero02.jpg" />

    Crédit photo&nbsp;: Mikael Tardif

1. C'est aussi très agréable de faire des séances de théorie 100% au tableau blanc, sans utiliser le projecteur

1. Les étudiant·e·s semblent apprécier l'utilisation de cartes à jouer et adhérent bien à l'idée de faire des entrevues formatives&nbsp;:

    * durant l'entrevue formative, l'étudiant.e démontre sa compréhension de la théorie avec des cartes ou en dessinant un schéma sur papier

1. Les étudiant·e·s semblent beaucoup apprécier l'outil de validation, en particulier le fait que l'outil génère des visualisations à partir de leur code. P.&nbsp;ex.&nbsp;:

    ```java
    cartes = new MaCarte[] {new MaCarte(1, Sorte.CARREAU),
                            null,
                            new MaCarte(1, Sorte.COEUR)};

    memoireA = null;
    memoireB = new MaCarte(1, Sorte.TREFLE);
    i = 1;
    aDeplacer = 2;
    ```

    <img src="/annexes/annexe_bilans/bilan_octobre_2022/cartes.png">

    <img src="/annexes/annexe_bilans/bilan_octobre_2022/graphe.png">


### Ce qui reste à peaufiner

1. Tout&nbsp;! L'approche a besoin de «&nbsp;vivre un peu&nbsp;». P.&nbsp;ex.&nbsp;:

    * plusieurs étudiant·e·s ont pris du temps à comprendre que l'outil de validation génère des visualisations à partir de leur code. Il faudra trouver des façons de présenter cet aspect plus directement (d'autant plus que c'est un aspect très apprécié une fois découvert&nbsp;!).

    * les étudiant·e·s ont trouvé facile de trier des cartes, mais plus difficile de traduire en code la procédure. Je pense que je devrais fournir plus d'exemples plus rapidement afin de pratiquer cette traduction.

1. Malheureusement, pour l'instant, créer un nouvel exemple de visualisation est difficile et long. Je dois écrire beaucoup de code pour créer les visualisations et ces dernières doivent quand même être capturées à la main avec un outil de capture d'écran. Certains graphes d'objets doivent aussi être retravaillés à la main. P.&nbsp;ex. le graphe ci-dessous a été retravaillé pour y inclure la variable `nouvelleTete`&nbsp;:

    <img class="figure" src="/annexes/annexe_bilans/bilan_octobre_2022/dyn01.png"/>


### Trois «&nbsp;intuitions de programmeur&nbsp;» à mieux enseigner

1. Construire et imaginer un graphe d'objets

1. Utiliser une variable de type «&nbsp;curseur&nbsp;» pour pointer sur différents objets d'un graphe d'objets durant l'exécution du programme

1. Utiliser des appels récursifs pour construire un graphe d'objet
