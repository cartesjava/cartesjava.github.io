public abstract class CleHachable <T extends Object> extends Cle<T> {
	
	public CleHachable(T valeurJava) {
		super(valeurJava);
	}

	public abstract int indice();
}
