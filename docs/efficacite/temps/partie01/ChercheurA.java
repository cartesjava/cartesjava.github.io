public int trouverIndicePourValeur(Tableau tableau, Comparable valeur) {
	int indice = -1;

	for(int i = 0; i < tableau.longueur(); i++) {
		if(tableau.obtenirValeur(i).compareTo(valeur) == 0) {
			indice = i;
		}
	}

	return indice;
}
