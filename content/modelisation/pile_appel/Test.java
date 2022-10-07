public class Test{

    public static void main(String[] args){

        factoriel(1000000000000000000l);

    }

    public static long factoriel(long n){
        return factoriel(n, 1);
    }

    public static long factoriel(long n, long courant){
        if(n == 0){

            return courant;

        }else{

            return factoriel(n-1, n * courant);

        }
    }

}
