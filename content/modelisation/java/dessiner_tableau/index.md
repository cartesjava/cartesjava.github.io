---
title: "Dessiner un tableau d'objets"
weight: 1
bookHidden: false
---

{{% pageTitle %}}


## Visualiser les objets

{{% video 
    src="/3c6/etape1/module3/theorie/dessiner_tableau/tableau01.webm" 
    width="50%"
    %}}

### Exemple 1

<img class="figure" src="cartesA.png"/>
<img class="figure" src="tableauA.png"/>

### Exemple 2


<img class="figure" src="cartesB.png"/>
<img class="figure" src="tableauB.png"/>

## Comprendre l'effet d'instructions typiques

### Accéder à une valeur

{{% video 
    src="/3c6/etape1/module3/theorie/dessiner_tableau/tableau02.webm" 
    width="50%"
    %}}

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


{{% video 
    src="/3c6/etape1/module3/theorie/dessiner_tableau/tableau03.webm" 
    width="50%"
    %}}

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

{{% video 
    src="/3c6/etape1/module3/theorie/dessiner_tableau/tableau04.webm" 
    width="50%"
    %}}

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

{{% video 
    src="/3c6/etape1/module3/theorie/dessiner_tableau/tableau05.webm" 
    width="50%"
    %}}

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

