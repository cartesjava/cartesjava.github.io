public class ElementChaineSimple<E> {
	
	private E valeur;

	private ElementChaineSimple<E> suivant = null;

	// [...]
	
	public void insererApres(E e) {

		ElementChaineSimple<E> nouveau = new ElementChaineSimple<E>(e);
		
		if(this.suivant != null) {
			nouveau.setSuivant(this.suivant);
		}
		
		this.suivant = nouveau;
	}

	// [...]
}
