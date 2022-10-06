List<Character> valeurs = new ArrayList<>();

cle01 = new ChaineHashb("x");
cle02 = new ChaineHashb("y");

map.put(cle01, 'a'):

    // la clé est "x", l'indice est 1 (la longueur)
    int indice01 = cle01.indice();
    valeurs.set(indice01, 'a');

map.put(cle02, 'b'):

    // la clé est "y", l'indice est encore 1!
    int indice02 = cle02.indice();
    valeurs.set(indice02, 'b');      

    // oups! On vient d'écraser la paire "x":'a'
