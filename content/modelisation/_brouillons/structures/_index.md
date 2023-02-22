---
title: "Structures en Java"
weight: 50
bookHidden: false
---

{{% pageTitle %}}

{{<excerpt class="note" >}}
NOTE&nbsp;: 

* on va voir les paramètres de types plus en détail à l'étape 3

{{</excerpt>}}

<br>
<br>



* Le JDK Java contient plusieurs structures de données déjà codées

* Dans ce cours, on va se concentrer sur les deux principales&nbsp;:
    * `List<E>`&nbsp;: une liste
    * `Map<K,V>`&nbsp;: un dictionnaire (mappage)

* À partir de maintenant, vous devriez&nbsp;:
    * presque toujours utiliser une `List<Integer>` et jamais un tableau `int[]`
    * presque toujours utiliser les structures fournies dans le JDK Java

* Exception&nbsp;: pour des raisons pédagogiques
    * p.&nbsp;ex. pour comprendre comment coder une liste

* Exception&nbsp;: dans des cas bien précis où on a besoin de notre propre structure de données
    * p.&nbsp;ex. liste d'objets 2d conçue pour détection de collision

## `List<E>`&nbsp;: liste en Java


* Exemple d'utilisation&nbsp;:

```java
{{% embed "./List_exemples.java" %}}
```

* Extrait de l'interface&nbsp;:

```java
{{% embed "./List_interface.java" %}}
```

* Documentation complète&nbsp;: 
    * <a target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">https://docs.oracle.com/javase/8/docs/api/java/util/List.html</a>

## Implantations de `List<E>`



* `List<E>` est une interface

* Le JDK Java fournit différentes implantations, p.&nbsp;ex&nbsp;:
    * `ArrayList<E>`
    * `LinkedList<E>`

* Pour l'instant, on va utiliser `ArrayList<E>`

* Quelle est la différence?
    * à utiliser&nbsp;: aucune (c'est la même interface)
    * en terme d'efficacité? à coder?
        * on va en parler à l'étape 4

## `Map<K,V>`&nbsp;: mappage en Java


* Les clés d'un mappage peuvent être de n'importe quel type
    * contrairement à notre `Dictionnaire` où les clés étaients toujours des chaînes

* Il y a deux paramètres de types&nbsp;:
    * `K`&nbsp;: le type des clés
    * `V`&nbsp;: le type des valeurs

* IMPORTANT&nbsp;: une clé est associée à **une seule valeur**

* Exemple d'utilisation&nbsp;:

```java
{{% embed "./Map_exemples.java" %}}
```
* NOTE&nbsp;: on utilise la notation `<P1, P2>` quand il y a plusieurs paramètres de type


* Extrait de l'interface&nbsp;:

```java
{{% embed "./Map_interface.java" %}}
```

* Documentation complète&nbsp;: 
    * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html" target="_blank">https://docs.oracle.com/javase/8/docs/api/java/util/Map.html</a>

## Implantations de `Map<K,V>`



* Le JDK Java fournit différentes implantations, p.&nbsp;ex.&nbsp;:
    * `HashMap<K,V>`
    * `TreeMap<K,V>`
    * `LinkedHashMap<K,V>`

* Quelle est la différence?
    * à utiliser&nbsp;: presqu'aucune (*)
    * à coder? en terme d'efficacité?
        * on en parle à l'étape 5

* (*) `LinkedHashMap` est un cas spécial&nbsp;:
    * en plus d'implanter l'interface `Map<K,V>`, on ajoute la promesse suivante&nbsp;:
        * il est possible d'accéder aux clés dans l'ordre où elles ont été insérées


## Encoder des données JSON en Java


* Une liste JSON est représenté en Java par `List<Object>`

* Un objet JSON est représenté en Java par `Map<String, Object>`

* Par exemple&nbsp;:

```json
{{% embed "MesDonneesJson03.json" %}}
```

<img src="./MesDonneesJson03.png"/>

```java
{{% embed "MesDonneesJson03.java" %}}
```




