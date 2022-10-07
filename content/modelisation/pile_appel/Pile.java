public static void A(int x, int y){

    B("a");
}

public static void B(String c){

    C(new char[]{'a','b'});
}

public static void C(char[] tab){

}

public static void main(String[] args){

    A(0,1);  

    // La pile va être
    //
    // au début:     main()                
    // appel de A:   main(), A(0,1)
    // appel de B:   main(), A(0,1), B("a")
    // appel de C:   main(), A(0,1), B("a"), C({'a','b'})
    // retour de C:  main(), A(0,1), B("a")
    // retour de B:  main(), A(0,1)
    // retour de A:  main()
}


