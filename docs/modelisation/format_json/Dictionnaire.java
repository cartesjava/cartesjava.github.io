public interface Dictionnaire<V extends Object> {
	
	void entreposerValeur(String cle, V valeur);

	V recuprerValeur(String cle);
	
	String trouverCle(V valeur);

}
