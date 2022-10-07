public interface List<E extends Object> extends Collection<E>{

    boolean    add(E e);           // ajoute à la fin
    void       add(int i, E e);    // insère une nouvelle valeur à la position i
    void       set(int i, E e);    // modifie la valeur à la position i
    E          get(int i);         // obtenir la valeur à la position i
    void       clear();            // vide la liste
    int        size();             // taille de la liste
    boolean    isEmpty();          // si vide
    boolean    contains(Object o); // si la liste contient la valeur o
    int        indexOf(Object o);  // indice de la valeur o


    //...
}
