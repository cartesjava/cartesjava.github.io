---
title: "Procédures déplacer/décaler"
weight: 10
bookHidden: false
bookNumbering: false
---

{{% pageTitle %}}

## Créer le projet

1. Télécharger {{% download "atelier1_3.zip" "atelier1_3.zip" %}}

1. Copier le fichier `atelier1_3.zip` **à la racine** de mon dépôt Git

1. Extraire les fichiers **directement** à la racine du dépôt Git

    * Clic-droit sur le fichier => *Extraire tout*

    * **Effacer `atelier1_3` du chemin proposé**

    * Cliquer sur *Extraire*

    * Choisir *Remplacer les fichiers dans la destination*

    * Vérifier que les fichiers sont **à la racine** du dépôt Git 

        * dans le même répertoire que `.git`

        

1. Ouvrir *Git Bash* **à la racine** de mon dépôt Git

    * *Windows 10* : Clic-droit => *Git Bash Here*
    * *Windows 11* : Clic-droit => *Show more options* => *Git Bash Here*

1. En Git Bash, exécuter le script `ajouter_atelier.sh`

    ```bash
    $ sh scripts/ajouter_atelier.sh
    ```

    * au besoin fermer Eclipse avant d'exécuter le script

    * appuyer sur {{% key "Entrée" %}} dans fenêtre *Git Bash* pour vraiment lancer le script


1. Attendre que le script termine

1. Ouvrir Eclipse et importer le projet `atelier1_3`

    * *File* => *Import* => *Existing Projects into Workspace*

    * Cliquer sur *Browse* et naviguer jusqu'à la racine de mon dépôt Git

    * Cliquer sur *Sélectionner un dossier*

    * Vérifier que le projet apparaît dans la case *Projects*

    * Cliquer sur *Finish*


## Créer la classe `MonTableau`

1. Dans Eclipse, sélectionner le projet `atelier1_3`

1. Ajouter la classe suivante au projet `atelier1_3`
    * Nom de la classe: `MonTableau`
    * **Ne pas** cocher `public static ...`

1. Ouvrir la classe `MonTableau` et ajuster la signature

    ```java
    public class MonTableau extends Tableau {
    ```

1. En utilisant le raccourci {{% key "Ctrl+1" %}}, effectuer les tâches suivantes
    * importer la classe `Tableau`

    * ajouter l'annotation `@SuppressWarnings("serial")`

## Créer la classe `Procedure`

1. Ajouter la classe suivante au projet `atelier1_3`
    * Nom de la classe: `Procedure`
    * **cocher** `public static ...`

1. Ouvrir la classe `Procedure` et ajuster la signature

    ```java
    public class Procedure extends ProcedureDecaler<MonTableau> {
    ```

1. En utilisant le raccourci {{% key "Ctrl+1" %}}, effectuer les tâches suivantes
    * importer la classe `ProcedureDecaler`

    * ajouter la méthode obligatoire `classeMonTableau`

1. Ajouter le code suivant à la méthode `main`

    ```java
    public static void main(String[] args) {
        NtroClientFx.launch(args);
    }
    ```

    * utiliser {{% key "Ctrl+1" %}} pour corriger les erreurs de compilation

1. Ajouter le code suivant à la méthode `classeMonTableau`

    ```java
    protected Class<MonTableau> classeMonTableau() {
        return MonTableau.class;
    }
    ```

## Coder les procédures dans la classe `MonTableau`

1. Ouvrir `MonTableau`

1. Ajouter la méthode suivante:

    ```java
    @Override
    public void deplacerDecaler() {

    }
    ```

1. Par héritage, `MonTableau` contient déjà les attributs que vous devez utiliser 

    <img class="figure" src="attributs.png" />

    {{<excerpt class="note">}}

**IMPORTANT** 

* il faut utiliser ces attributs plutôt que des variables
    * p.ex. utiliser l'attribut `i` dans la boucle `for` et non une variable `int i`
* sinon l'outil de validation ne pourra pas visualiser l'exécution de votre code

    {{</excerpt>}}


1. Coder les deux procédures directement dans la méthode `deplacerDecaler`
    * la méthode `deplacerDecaler` appelée par l'outil de validation pour exécuter une de vos procédures
    * selon la valeur de l'attribut `insrerAuDebut`, votre code devra exécuter la procédure pour déplacer au début, ou sinon la procédure pour déplacer à la fin
    * **TRUC** ajouter des méthodes privées à votre classe `MonTableau` et les appeler selon la valeur de `insererAuDebut`

## Exécuter l'outil de validation

1. L'outil va vous indiquer si votre code est une solution (✔) ou s'il contient une ou des erreurs (✗)

    <img class="small-figure" src="solution_ou_erreur.png"/>

    {{<excerpt class="note">}}

**IMPORTANT** 

* il faut quand même regarder la console pour voir les exceptions de type `IndexOutOfBounds` ou `NullPointerException`
* vous pouvez quand même utiliser le débogueur

    {{</excerpt>}}

## Utiliser l'outil de validation pour visualiser votre code

1. Pour que l'outil puisse afficher chacune des étapes de la procédure, vous devez ajouter à la main des instructions `Execution.ajouterEtape()`, p.ex.

    ```java
    @Override
    public void deplacerDecaler() {

        i = 0;

        Execution.ajouterEtape();

        memoireA = cartes[0];

        Execution.ajouterEtape();
    }
    ```

    * c'est à vous de décider ce qui constitue une étape. 
    * cela n'influence pas la validation, mais vous permet de visualiser ce que votre code fait et pourrait vous aider à trouver des erreurs

## Question bonus 

1. Coder une autre procédure qui implante l'opération *déplacer au début*

1. Avec l'outil de validation, comparer le nombre d'étapes entre la procédure vue en théorie et la votre

1. Quelle est la différence d'efficacité? Est-ce une grosse différence selon vous?








