public interface MapJava<C extends Cle<?>, V extends Object> {
	
	void       put(C c, V v);      // associe la valeur v à la clé c
	V          get(C c);           // obtenir la valeur associée à la clé c
	void       clear();            // vide le map
	int        size();             // taille du map
	boolean    isEmpty();          // si vide
	boolean    containsKey(C c);   // si le map contient la clé c
	boolean    containsValue(V v); // si le map contient la valeur v
	void       remove(C c);        // effacer la clé c (et la valeur associée)
	List<C>    keys();             // retourner une liste de clés

}
