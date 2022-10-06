public class ListeJavaArray<E extends Object> extends ListeJava<E> {
	
	private final int TAILLE_INITIALE = 1; // Pour tester aggrandir

	private E[] grosTableau;
	private int indiceDernierElement = -1;
	
	@Override
	public void add(E e) {
		if(indiceDernierElement == grosTableau.length - 1) {
			aggrandir();
		}
		
		indiceDernierElement++;

		grosTableau[indiceDernierElement] = e;
	}
