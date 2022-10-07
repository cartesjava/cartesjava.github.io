---
title: "Structures en Java"
weight: 50
bookHidden: false
---

{{% pageTitle %}}

{{<excerpt class="note" >}}
NOTE: 

* on va voir les paramètres de types plus en détail à l'étape 3

{{</excerpt>}}

<br>
<br>



* Le JDK Java contient plusieurs structures de données déjà codées

* Dans ce cours, on va se concentrer sur les deux principales:
    * `List<E>`: une liste
    * `Map<K,V>`: un dictionnaire (mappage)

* À partir de maintenant, vous devriez:
    * presque toujours utiliser une `List<Integer>` et jamais un tableau `int[]`
    * presque toujours utiliser les structures fournies dans le JDK Java

* Exception: pour des raisons pédagogiques
    * p.ex. pour comprendre comment coder une liste

* Exception: dans des cas bien précis où on a besoin de notre propre structure de données
    * p.ex. liste d'objets 2d conçue pour détection de collision

## `List<E>`: liste en Java


* Exemple d'utilisation:

```java
{{% embed "./List_exemples.java" %}}
```

* Extrait de l'interface:

```java
{{% embed "./List_interface.java" %}}
```

* Documentation complète: 
    * <a target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">https://docs.oracle.com/javase/8/docs/api/java/util/List.html</a>

## Implantations de `List<E>`



* `List<E>` est une interface

* Le JDK Java fournit différentes implantations, p.ex:
    * `ArrayList<E>`
    * `LinkedList<E>`

* Pour l'instant, on va utiliser `ArrayList<E>`

* Quelle est la différence?
    * à utiliser: aucune (c'est la même interface)
    * en terme d'efficacité? à coder?
        * on va en parler à l'étape 4

## `Map<K,V>`: mappage en Java


* Les clés d'un mappage peuvent être de n'importe quel type
    * contrairement à notre `Dictionnaire` où les clés étaients toujours des chaînes

* Il y a deux paramètres de types:
    * `K`: le type des clés
    * `V`: le type des valeurs

* IMPORTANT: une clé est associée à **une seule valeur**

* Exemple d'utilisation:

```java
{{% embed "./Map_exemples.java" %}}
```
* NOTE: on utilise la notation `<P1, P2>` quand il y a plusieurs paramètres de type


* Extrait de l'interface:

```java
{{% embed "./Map_interface.java" %}}
```

* Documentation complète: 
    * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html" target="_blank">https://docs.oracle.com/javase/8/docs/api/java/util/Map.html</a>

## Implantations de `Map<K,V>`



* Le JDK Java fournit différentes implantations, p.ex:
    * `HashMap<K,V>`
    * `TreeMap<K,V>`
    * `LinkedHashMap<K,V>`

* Quelle est la différence?
    * à utiliser: presqu'aucune (*)
    * à coder? en terme d'efficacité?
        * on en parle à l'étape 5

* (*) `LinkedHashMap` est un cas spécial:
    * en plus d'implanter l'interface `Map<K,V>`, on ajoute la promesse suivante:
        * il est possible d'accéder aux clés dans l'ordre où elles ont été insérées


## Encoder des données JSON en Java


* Une liste JSON est représenté en Java par `List<Object>`

* Un objet JSON est représenté en Java par `Map<String, Object>`

* Par exemple:

```json
{{% embed "MesDonneesJson03.json" %}}
```

<img src="./MesDonneesJson03.png"/>

```java
{{% embed "MesDonneesJson03.java" %}}
```




