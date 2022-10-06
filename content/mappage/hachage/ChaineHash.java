public class ChaineHash extends CleHachable<String> {

	public ChaineHash(String valeurJava) {
		super(valeurJava);
	}

	@Override
	public int indice() {
		int indice = 0;
		for(int i = 0; i < valeurJava().length(); i++) {
			indice += valeurJava().charAt(i);
		}
		return indice;
	}

}
