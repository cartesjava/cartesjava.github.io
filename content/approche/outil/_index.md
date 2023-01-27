---
title: "Outil de validation"
weight: 10
# bookFlatSection: false
# bookToc: true
# bookHidden: false
# bookCollapseSection: false
# bookComments: false
# bookSearchExclude: false
---

{{% pageTitle %}}


## Démarrer l'outil

Pour utiliser l'outil de validation, il faut l'intégrer à un projet Java. 
Pour l'exemple présenter en <a href="/intro">introduction</a>, on 
débutera avec le code suivant:

```java
{{% embed src="MonTableau.java" %}}
```

```java
{{% embed src="Procedure.java" %}}
```

À l'exception de la méthode `deplacerDelacer`, qui doit être complétée, les
étudiant·s n'ont pas à comprendre ce code, qui ne sert qu'à intégrer
l'outil de validation à leur projet Java. Pour plus de détails, voir les exemples d'ateliers
à <a href="/annexe-ateliers">l'Annexe 4</a>.

Exécuter le projet Java va démarrer l'outil:

<center>
<img class="figure" src="outil01.png"/>
</center>


À noter que bien que le manuel fait référence à un outil de validation (au
singulier), il faut en réalité intégrer une version différente de l'outil de
validation pour chaque procédure à valider. Chaque version définit aussi sa
propre visualiation des données avec des cartes à jouer.  Voir <a
href="/annexe-ateliers">l'Annexe 2</a> pour plus de détails.


## Utiliser l'outil

Voici les affichages principaux de l'outil de valiation

<center>
<img class="figure" src="outil02.png"/>
</center>

### Visualisation avec des cartes à jouer

<center>
<video autoplay loop mute controls="false" style="width:300px;">
    <source src="visualisation01.mp4" type="video/mp4"/>
    <source src="visualisation01.mp4" type="video/webm"/>
</video>
</center>

### Sélection de différents cas de test

<center>
<img class="figure" src="cas_de_test01.png"/>
</center>

<center>

<table>
<tr>
<th>Symbole </th>
<th>Signification </th>
</tr>


<tr>
<th><span style="font-size:1.5rem;">✔</span></th>
<td>Validation réussie</td>
</tr>

<tr>
<th><span style="font-size:1.5rem;">✗</span></th>
<td>Erreur de validation</td>
</tr>


<tr>
<th><span style="font-size:1.5rem;">¤</span></th>
<td>Plantage lors de la validation</td>
</tr>

</table>
</center>

### Navigation entre les étapes de la procédure

<center>
<video autoplay loop mute controls="false" style="width:300px;">
    <source src="navigation01.mp4" type="video/mp4"/>
    <source src="navigation02.mp4" type="video/webm"/>
</video>
</center>

### Valeurs des attributs 

<center>
<table>
<tr>
<th>Étape 1</th>
<th>Étape 2</th>
</tr>
<tr>
<td>
<img src="variables01.png"/>
</td>
<td>
<img src="variables02.png"/>
</td>
</tr>
<tr>
<th>Étape 3</th>
<th>Étape 4</th>
</tr>
<td>
<img src="variables03.png"/>
</td>
<td>
<img src="variables04.png"/>
</td>
</tr>
</table>
</center>

## Expérimenter avec les données 

Format JSON à <a href="/approche/langages_et_notations/#json">Section 1.2.3</a>

<center>
<video class="border-black" autoplay loop mute controls="false" style="max-width:75%;">
    <source src="modifier_json.mp4" type="video/mp4"/>
    <source src="modifier_json.mp4" type="video/webm"/>
</video>
</center>


## Trouver des erreurs dans la procédure implantée

<center>
<table>
<tr>
<th>
Procédure correcte (solution)
</th>

<td>
<video autoplay loop mute controls="false" style="width:300px;">
    <source src="visualisation01.mp4" type="video/mp4"/>
    <source src="visualisation01.mp4" type="video/webm"/>
</video>
</td>
</tr>

<tr>
<th>
Procédure erronée
</th>

<td>
<video autoplay loop mute controls="false" style="width:300px;">
    <source src="trouver_erreur01.mp4" type="video/mp4"/>
    <source src="trouver_erreur01.mp4" type="video/webm"/>
</video>
</td>
</tr>
</table>
</center>


## Afficher le graphe d'objets

Graphe d'objets <a href="/approche/langages_et_notations/#graphe-dobjets">Section 1.2.2</a>

<table>
<tr>
<th>
Données JSON
</th>
<th>
Graphe d'objets
</th>
</tr>

<tr>
<td>

```json
{{% embed src="MonTableau.json" %}}
```

</td>

<td>
<img src="MonTableau.png"/>
</td>


</tr>


</table>



