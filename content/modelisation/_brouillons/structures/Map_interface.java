public interface Map<K extends Object, V extends Object> {

    V          put(K c, V v);           // associe la valeur v à la clé c
    V          get(K c);                // obtenir la valeur associée à la clé c
    void       clear();                 // vide le map
    int        size();                  // taille du map
    boolean    isEmpty();               // si vide
    boolean    containsKey(Object c);   // si le map contient la clé c
    boolean    containsValue(Object v); // si le map contient la valeur v

    //...
}
