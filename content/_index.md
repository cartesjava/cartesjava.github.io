---
title: "Code les cartes!"
weight: 1
# bookFlatSection: false
# bookToc: true
# bookHidden: false
bookCollapseSection: true
# bookComments: false
# bookSearchExclude: false
bookNumbering: false
---

<h1>Code les cartes!<br>
<span style="font-size:1.4rem;">
Apprendre à programmer efficacement avec des cartes à jouer 
</span>
</h1>

<br>

<table style="background:#f0f0f0">
<tr>
<td style="font-size:1.25rem;">
Sur la table<br>
<img src="/bilan2022/travail02.jpg" />
</td>
<td style="font-size:1.25rem;">
À l'écran<br>
<img src="/bilan2022/travail01.jpg" />
</td>
</tr>
<tr>
<td colspan="2" style="background:#f0f0f0">
<br>
<center>
<div id="code-intro" style="max-width:23.5rem;background:#f0f0f0;text-align:left;">
<span style="position:relative;left:0.95rem;font-size:1.25rem">Et dans le code&nbsp;!</span><br>
<div>
{{< highlight java>}}
Carte maCarte = new Carte(5, COEUR);
{{< /highlight >}}
</div>
</div>
</center>

</td>

</tr>
</table>

<script>
// https://stackoverflow.com/questions/36532307/rem-px-in-javascript
function convertRemToPixels(rem) {    
    return rem * parseFloat(getComputedStyle(document.documentElement).fontSize);
}

function adjustCodeDivWidth(){

    const codeDiv = document.querySelector("#code-intro");
    const codeSpan = codeDiv.querySelector("pre>code>span>span");

    if(codeSpan) {

        const codeWidth = codeSpan.offsetWidth + 2*convertRemToPixels(1);

        console.log("ajusting the width of #code-intro to: " + codeWidth);

        codeDiv.style["width"] = codeWidth + "px";
    }
}

addEventListener("load", (event) => {
    adjustCodeDivWidth();
});

</script>
