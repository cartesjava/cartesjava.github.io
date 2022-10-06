ListeJava<Character> melanger(ListeJava<Character> entree){

    ListeJava<Character> resultat;
    resultat = nouvelleListe();

    while(!entree.isEmpty()){

        int positionAuHasard = alea.nextInt(entree.size());

        Character elementAuHasard = entree.get(positionAuHasard);

        resultat.add(elementAuHasard);   // cache une boucle?

        entree.remove(positionAuHasard); // cache une boucle?
    }

    return resultat;
}
