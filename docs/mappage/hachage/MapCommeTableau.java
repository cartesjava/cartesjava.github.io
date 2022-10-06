// Java valide
Character[] tableauChar = new String[3];

tableauChar[0] = 'a';        // l'indice est un entier
tableauChar[1] = 'b';
tableauChar[2] = 'c';

//  0   1   2
// ['a','b','c']         


// Ce qu'on aimerais avoir (pas du Java valide)
<String, Character>[] mapChar; 
mapChar = new <String, Character>[3]; 

mapChar["premier"]   = 'a';  // l'indice est une chaîne!
mapChar["deuxième"]  = 'b';
mapChar["troisième"] = 'c';

//   "premier" "deuxième" "troisième"
// [ 'a',      'b',       'c']         

