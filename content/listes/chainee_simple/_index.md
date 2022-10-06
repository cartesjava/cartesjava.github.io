---
title: "Liste chaînée simple"
weight: 20
---

{{% pageTitle %}}


* Une liste chaînée utilise des pointeurs (références), p.ex:

<center>
    <img src="liste01.svg" width="98%"/>
</center>

* Chaque noeud ci-haut est un objet qui contient une valeur

* Pour obtenir le prochain élément, on suit la référence (la flèche)

* Inconvénient:
    * il faut faire une boucle pour obtenir un élément de la liste

* Avantages:
    * l'insertion/retrait au début est efficace
    * on ne consome pas d'espace mémoire en trop

## Exemple: ajouts dans liste chaînée simple


<table>

<tr>
<td>
<code>liste<br>// []</code>
</td>
<td>
<img src="simple_add01.svg"/>
</td>
</tr>

<tr>
<td>
<code>liste.add('a')<br>// [a]</code>
</td>
<td>
<img src="simple_add02.svg"/>
</td>
</tr>

<tr>
<td>
<code>liste.add('b')<br>// [a,b]</code>
</td>
<td>
<img src="simple_add03.svg"/>
</td>
</tr>

<tr>
<td>
<code>liste.add('c')<br>// [a,b,c]</code>
</td>
<td>
<img src="simple_add04.svg"/>
</td>
</tr>

</table>

## Liste chaînée simple en Java



* Il faut une classe pour représenter un élément:
    * l'élément contient la valeur et un pointeur vers l'élément suivant

```java
{{% embed "ElementChaineSimple.java" %}}
```


* Et une classe pour la liste:
    * on mémorise la tête et la taille

```java
{{% embed "ListeJavaChaineeSimple.java" %}}
```
    
* Pour modifier un élément, il d'abord le trouver avec une boucle

