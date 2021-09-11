public class StaticMethods {
    //absolute value of an int
    public static int abs(int x){
        if (x < 0) return -x;
        else return x;
    }

    //absolute value of double
    public static double abs(double x){
        if (x < 0) return -x;
        else return x;
    }

    //primality test
    public static boolean isPrime(int x){
        if (x<2) return false;
        for (int i=2;i*i<=x;i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
