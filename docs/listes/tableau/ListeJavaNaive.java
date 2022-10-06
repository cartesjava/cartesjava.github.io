public class ListeJavaNaive<E extends Object> extends ListeJava<E> {

	private E[] elements;

	@Override
	public void set(int i, E e) {
		elements[i] = e;
	}

	@Override
	public void add(E e) {
		E[] nouveauxElements = nouveauTableau(elements.length + 1);

		for(int i = 0; i < elements.length; i++){
		    nouveauxElements[i] = elements[i];
		}
		
		nouveauxElements[nouveauxElements.length - 1] = e;
		
		elements = nouveauxElements;
	}

	@Override
	public E get(int i) {
		return elements[i];
	}



	public ListeJavaNaive(Class<E> typeElement) {
		super(typeElement);

		elements = nouveauTableau(0);
	}
	
	private E[] nouveauTableau(int taille) {
		return (E[]) Array.newInstance(typeElement, taille);
	}

	private void copier(E[] src, E[] dst, int debut, int fin, int offset) {
		for(int i = debut; i < fin; i++){
			dst[i+offset] = src[i];
		}
	}

	private void copierTout(E[] src, E[] dst, int offset) {
		copier(src,dst, 0, src.length, offset);
	}


	@Override
	public void addAll(E[] elements) {
		for(E e : elements) {
			add(e);
		}
	}

	@Override
	public void insert(int i, E e) {
		E[] nouveauxElements = nouveauTableau(elements.length + 1);
		
		copier(elements, nouveauxElements, 0, i, 0);
		
		nouveauxElements[i] = e;
		
		copier(elements, nouveauxElements, i, elements.length, 1);
		
		elements = nouveauxElements;
	}

	@Override
	public void set(int i, E e) {
		elements[i] = e;
	}

	@Override
	public E get(int i) {
		return elements[i];
	}

	@Override
	public void clear() {
		elements = nouveauTableau(0);
	}

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public boolean isEmpty() {
		return elements.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	@Override
	public int indexOf(Object o) {
		int indice = -1;
		
		for(int i = 0; i < elements.length; i++) {
			if(elements[i].equals(o)) {
				indice = i;
				break;
			}
		}

		return indice;
	}

	@Override
	public void removeValue(Object o) {
		int indice = indexOf(o);
		if(indice >= 0) {
			remove(indice);
		}
	}

	@Override
	public void remove(int i) {
		E[] nouveauxElements = nouveauTableau(elements.length - 1);
		
		copier(elements, nouveauxElements, 0, i, 0);
		copier(elements, nouveauxElements, i+1, elements.length, -1);
		
		elements = nouveauxElements;
	}

}
