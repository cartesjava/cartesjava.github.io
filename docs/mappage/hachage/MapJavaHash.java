public class   MapJavaHash <C extends CleHachable<?>, V extends Object> 
       extends MapJava<C,V> {
	
	private static final int TAILLE_TABLE_HACHAGE = 1000;
	
	@SuppressWarnings("unchecked")
	private MapJavaNaif<C,V>[] table = new MapJavaNaif[TAILLE_TABLE_HACHAGE];
	private int taille = 0;
