public class ChaineHashb extends CleHachable<String> {

	public ChaineHashb(String valeurJava) {
		super(valeurJava);
	}

	@Override
	public int indice() {
		return valeurJava().length();
	}

}
