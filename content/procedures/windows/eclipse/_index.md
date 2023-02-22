---
title: "Procédure: installer Eclipse"
weight: 2
# bookFlatSection: false
# bookToc: true
bookHidden: true
# bookCollapseSection: false
# bookComments: false
# bookSearchExclude: false
---

{{% pageTitle %}}

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
Rappel&nbsp;: ne pas effectuer cette étape sur un Windows du Collège
</div>
</center>

<br>
<br>

1. **Recomandé**&nbsp;: désinstaller toute ancienne version d'Eclipse

1. Installer Eclipse (version *2022-06* ou plus récent)
	* Visiter <a href="https://www.eclipse.org/downloads/">https://www.eclipse.org/downloads/</a>
	* Télécharger en cliquant sur <i>Download x86_64</i>
	* Exécuter `eclipse-inst-win64.exe`
	* Installer *Eclipse IDE for Java Developers* avec les options par défaut

## Configurer Eclipse

<!--
<center>
<video width="50%" src="configurer_eclipse.webm" type="video/webm" controls playsinline>
</center>
-->

1. Je démarre Eclipse
	* Je choisi mon `WORKSPACE`, p.&nbsp;ex. 
		* `Z:\eclipse-workspace` (Windows du Collège)
		* `C:\Users\PRENOM_NOM\eclipse-workspace` (Mon Windows)

1. Je m'assure que Eclipse utilise le *JDK 11*
	* *Window* => *Preferences*
	* *Java* => *Installed JREs*

		<center>
			<img width="80%" src="eclipse_jre.png">
		</center>

	* Idéallement, Eclipse utilise **uniquement** le *JDK 11*

	* Si j'en ai pas besoin, je fait *Remove* sur tous les JDK **sauf 11**

	* Si le *JDK 11* n'est pas là, je l'ajoute&nbsp;:
		* *Add* =>
		* *Standard VM* => *Next*
		* Sélectionner le répertoire racine du *JDK*, p.&nbsp;ex&nbsp;: 
			* `C:\Program Files\Java\jdk-11.XXX`
		* *Finish*
		* *Apply and Close*

	* Je m'assure que le *JDK 11* est le défaut (en gras)
    


