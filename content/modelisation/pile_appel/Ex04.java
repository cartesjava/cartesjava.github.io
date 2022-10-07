public int factoriel(int n){
    return factoriel(n, 1);
}

public int factoriel(int n, int courant){
    if(n == 0){

        return courant;

    }else{

        return factoriel(n-1, n * courant);
    }
}
