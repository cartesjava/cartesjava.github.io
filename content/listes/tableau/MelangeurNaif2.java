ListeJava<Character> melanger(ListeJava<Character> entree){

    ListeJava<Character> resultat;
    resultat = nouvelleListe();

    while(!entree.isEmpty()){

        int positionAuHasard = alea.nextInt(entree.size());

        Character elementAuHasard = entree.get(positionAuHasard);

        resultat.add(elementAuHasard);   // efficace

        entree.remove(positionAuHasard); // à éviter!
    }

    return resultat;
}
