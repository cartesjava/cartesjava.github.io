---
title: "Annexe 2: comment copier et modifier ce manuel"
bookCollapseSection: false
weight: 100
---

# Comment modifier ce manuel

## Obtenir les sources

Le source est ici: https://gitlab.com/mathieu-bergeron/codelescartes.ca

1. On peut télécharger les sources en `.zip`

    <img class="small-figure" src="telecharger01.png"/>

1. Ou cloner le dépôt Git qui est public

    ```bash
    $ git clone https://gitlab.com/mathieu-bergeron/codelescartes.ca
        
    ```

## Suggérer une modification

1. Par courriel au <a href="mailto:mathieu.bergeron@cmontmorency.qc.ca">mathieu.bergeron@cmontmorency.qc.ca</a>

1. Via GitLab

    * «forker» le dépôt

        <img class="figure" src="fork01.png"/>

    * dans votre dépôt, modifier directement les sources (sur GitLab ou en local après avoir cloné)

        <img class="figure" src="modifier01.png"/>
        <img class="figure" src="modifier02.png"/>

    * sauvegarder vos modifications (c-à-d faire un commit, suivi d'un push si vous travaillez en local) 

        * SVP utiliser la branche `main`

            <img class="small-figure" src="modifier03.png"/>

    * ouvrir un «merge request» pour que le mainteneur de https://gitlab.com/mathieu-bergeron/codelescartes.ca soit averti de vos suggestions

        * SVP choisir votre branche `main` comme branche source et la branche `main` de `mathieu-bergeron/codelescartes.ca` comme branche cible

            <img class="figure" src="merge_request01.png"/>

            <img class="figure" src="merge_request02.png"/>


