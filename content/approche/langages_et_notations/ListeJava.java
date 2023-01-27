public interface ListeJava<V extends Object> {

	boolean siVide();
	
	int longueur();

	V obtenirValeur(int indice);

	void modifierValeur(int indice, V nouvelleValeur);

	void ajouter(V nouvelleValeur); // la liste grandit

	void retirer(int indice); // la liste rapetisse

	void retirer(V valeur);

}
