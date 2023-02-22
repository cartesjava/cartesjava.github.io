public int factoriel(int n){
    int resultat;

    if(i == 0){

        resultat = 1;

    }else{

        resultat = n;

        for(int i = n-1; i > 0; i--){
            resultat = resulat * i;
        }

    }

    return resultat;
}
