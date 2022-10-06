public class ListeJavaChaineeSimple<E extends Object> extends ListeJava<E> {
	
	private int taille = 0;
	private ElementChaineSimple<E> tete = new ElementChaineSimple<E>();

	// [...]
	
	private ElementChaineSimple<E> atteindreElement(int position) {
		ElementChaineSimple<E> element = tete;
		
		for(int i = 0; i < position; i++) {
			if(element != null) {
				element = element.suivant();
			}
		}

		return element;
	}

	@Override
	public void set(int position, E e) {
		ElementChaineSimple<E> element = atteindreElement(position);
		
		element.set(e);
	}

	// [...]
}
