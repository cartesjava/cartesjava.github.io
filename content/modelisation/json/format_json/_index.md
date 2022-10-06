---
title: "Format JSON"
weight: 1
bookHidden: false
---

{{% pageTitle %}}

* Le format JSON est très populaire pour représenter des données

* JSON veut dire *Javascript Object Notation*

* C'est le format prévilégié pour les applications Web

* Les bases de données NoSQL utilisent souvent un format similaire à JSON

* Voici les *valeurs* en JSON:
    * la valeur nulle: `null`
    * un booléen: `true`  ou `false`
    * un nombre comme: `1`, `4.5`, `-10.1` 
    * une chaîne comme: `"asdf"`, `""`, `"Bonjour!"`

* Voici les *structures* en JSON:
    * une liste comme: 
        * `[1, 3, -1]`
        * `[]`
        * `["asfd", "Bonjour!", ""]`
    * une objet comme: 
        * `{"cle01":true}`
        * `{}`
        * `{"cle01":true, "cle02":-12}`

## Les listes en JSON


* Une liste est un tableau qui peut grandir et rapetisser

```java
{{% embed "ListeJava.java" %}}
```

* Une des particularité des la liste JSON est de mélanger les types de valeurs:
    * `[1,true,"Bonjour!"]`
    * `[null, "", 1, false]`

## Les objets JSON


* Un objet JSON permet d'accéder à des valeurs avec des clés
    * une clé est toujours une chaîne
    * la valeur peut être n'importe quelle valeur JSON

* L'objet JSON est un exemple de `Dictionnaire`:

```java
{{% embed "Dictionnaire.java" %}}
```

* Quand on entrepose une valeur, le dictionnaire:
    * grandit si la clé n'existait pas
    * modifie la valeur si la clé existait

```java
{{% embed "Dictionnaire_exemple.java" %}}
```


## JSON est un format récursif


* La présentation de JSON à date est incomplète

* En fait, JSON est un format récursif:
    * on peut avoir `[1,2,[2,4]]` (une liste à l'intérieur d'une liste)
    * on peut avoir `[1,2,[2,[5,423]]]` 
    * on peut avoir `[1,2,[2,[[44,2],423]]]` 
    * etc.

* Les structures récursives sont très populaires en informatique
    
* Avant de continuer avec JSON, on va regarder la notion d'arbre

* L'arbre est une structure récursive assez simple


* On peut penser à une liste récursive comme à un arbre:
    * p.ex: `[1,2,[2,[[44,2],423]]]` 

    <center>
        <img src="arbre03.svg" width="50%">
    </center>

    * une liste contenant
        * `1`
        * `2`
        * une liste contenant
            * `2`
            * une liste contenant
                * une liste contenant
                    * `44`
                    * `2`
                * `423`

* On voit qu'une liste peut être insérée à la place d'une valeur

* C'est la même chose pour les objets JSON

* Partout où on s'attend à avoir une valeur, on peut avoir une liste ou un objet

* Par exemple, voici des données JSON valides:
    * `{"cle01":[1,4,true,null,[1,"asdf"],{"test":false}]}`
    * `[4.0,-2,{"un":1,"deux":2,"trois":{"nom":"Trois"}}]`
    * ...

