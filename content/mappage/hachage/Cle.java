public class Cle<T extends Object> {
	
	private T valeurJava;
	
	public Cle(T valeurJava) {
		this.valeurJava = valeurJava;
	}
	
	public T valeurJava() {
		return valeurJava;
	}
}
