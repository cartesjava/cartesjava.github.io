---
title: "Tableaux d'objets"
weight: 20
bookHidden: false
---

{{% pageTitle %}}

## Tableau de cartes

<img class="figure" src="MonTableau.png"/>


### Exemple 1

<img class="figure" src="cartesA.png"/>
<img class="figure" src="tableauA.png"/>

### Exemple 2


<img class="figure" src="cartesB.png"/>
<img class="figure" src="tableauB.png"/>


## Tableau de films et de personnages

<img class="figure" src="FilmTableau.png"/>
<br>
<img class="figure" src="PersonnageTableau.png"/>


## Comprendre l'effet d'instructions typiques

### Accéder à une valeur


#### Example 1

<table>
<tr>
<th>Objets au départ</th>
<th>Instructions</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauB.png"/>
</td>
<td>

```java
memoireA.getNumero();
memoireA.getSorte();
```

</td>
<td>

```java
5
"TREFLE"
```


</td>
</tr>
</table>

#### Example 2

<table>
<tr>
<th>Objets au départ</th>
<th>Instructions</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauA.png"/>
</td>
<td>

```java
cartes[2].getNumero();
cartes[2].getSorte();
```

</td>
<td>

```java
3
"CARREAU"
```


</td>
</tr>
</table>

#### Example 3

<table>
<tr>
<th>Objets au départ</th>
<th>Instructions</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauB.png"/>
</td>
<td>

```java
cartes[2].getNumero();
memoireB.getNumero();
```

</td>
<td>

```java
java.lang.NullPointerException
java.lang.NullPointerException
```


</td>
</tr>
</table>



### Déplacer un objet (déplacer une carte)



#### Exemple 1

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauA.png"/>
</td>
<td>

```java
memoireA = cartes[0];
cartes[0] = null;
```

</td>
<td>
<img class="figure" src="tableauA_apres1.png"/>
</td>
</tr>
</table>

#### Exemple 2

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauB.png"/>
</td>
<td>

```java
cartes[2] = cartes[0];
cartes[0] = null;
```

</td>
<td>
<img class="figure" src="tableauB_apres1.png"/>
</td>
</tr>
</table>

### Copier la référence à un objet


#### Exemple 1

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauA.png"/>
</td>
<td>

```java
memoireA = cartes[0];
```

</td>
<td>
<img class="figure" src="tableauA_apres2.png"/>
</td>
</tr>

</table>

#### Exemple 2

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>

<tr>
<td>
<img class="figure" src="tableauB.png"/>
</td>
<td>

```java
cartes[2] = cartes[0];
```

</td>
<td>
<img class="figure" src="tableauB_apres2.png"/>
</td>
</tr>
</table>




### Créer un nouvel objet (créer une nouvelle carte)


#### Exemple 1

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>


<tr>
<td>
<img class="figure" src="tableauA.png"/>
</td>
<td>

```java
memoireA = new Carte(2, "TREFLE");
```

</td>
<td>
<img class="figure" src="tableauA_apres3.png"/>
</td>
</tr>

</table>

#### Exemple 2

<table>
<tr>
<th>Objets au départ</th>
<th>Instruction</th>
<th>Résultat</th>
</tr>


<tr>
<td>
<img class="figure" src="tableauB.png"/>
</td>
<td>

```java
memoireB = new Carte(5, "TREFLE");
```

</td>
<td>
<img class="figure" src="tableauB_apres3.png"/>
</td>
</tr>

</table>


## Références multiples


Typiquement, on va copier une référence à un objet, plutôt que déplacer l'objet.

<table>
<tr>
<th>
Typique
</th>
<th>
Plus rare
</th>
</tr>

<tr>
<td>

```java
memoireA = cartes[0];
```

</td>
<td>

```java
memoireA = cartes[0];
cartes[0] = null;
```

</td>
</tr>
</table>

Le résultat est qu'on a des références multiples: plusieurs références vers le même objet.

<img class="figure" src="tableauA_multiples.png"/>

Si on visualise du code typique avec les cartes, on va visualiser les références multiples en affichant plusieurs copies d'une carte.

<center>
<video autoplay loop mute controls="false" style="width:300px;">
    <source src="references_multiples.webm" type="video/mp4"/>
    <source src="references_multiples.mp4" type="video/webm"/>
</video>
</center>



La visualisation est correcte, mais plus difficile à lire.

<img class="figure" src="cartesA.png"/>
<img class="figure" src="tableauA.png"/>


Autant que possible, on va expliquer les procédures en déplaçant les cartes, 
c'est-à-dire
en évitant de créer des références multiples.
Cependant, il faut garder en tête que le code typique contient très souvent des références multiples.




