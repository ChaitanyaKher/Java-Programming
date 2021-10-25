public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(123213,213123));
        System.out.println(EuclidGDC(123213, 213123));
        System.out.println(gcd(123213,213123));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int smallerNumber = Math.min(first, second);
            for (int gcd = smallerNumber; gcd > 0; gcd--) {
                if ((first % gcd == 0) && (second % gcd == 0)) {
                    return gcd;
                }
            }
        }
        return -1;
    }

    public static long EuclidGDC(long first, long second) {
        if (second == 0)
            return first;
        long ap = second/first;
        return EuclidGDC(second,ap);
    }

    //A greedy approach to gcd
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;
//        System.out.println(a);
//        System.out.println(b);
        // a is greater
        if (a > b) {
//            System.out.println("A "+a);
//            System.out.println("B "+b);
            return gcd(a - b, b);
        }
        return gcd(a, b-a);
    }
}