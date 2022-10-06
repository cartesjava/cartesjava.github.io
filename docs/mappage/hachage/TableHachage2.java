MapJava<Cle,Character>[] valeurs = new MapJava<Cle,Character>[1000];

cle01 = new ChaineHashb("x");
cle02 = new ChaineHashb("y");
cle03 = new ChaineHashb("z");

map.put(cle01, 'a'):

    // la clé est "x", l'indice est 1 (la longueur)
    int indice01 = cle01.indice();

    // insérer d'abord un map à l'indice
    valeurs[indice01] = new MapJavaNaif<>();

    valeurs[indice01].put(cle01, 'a');

map.put(cle02, 'b'):

    // la clé est "y",  l'indice est encore 1
    int indice02 = cle02.indice();
    valeurs[indice02].put(cle02, 'b');

map.put(cle03, 'c'):

    // la clé est "z", l'indice est encore 1
    int indice03 = cle03.indice();
    valeurs[indice03].put(cle03, 'c');
