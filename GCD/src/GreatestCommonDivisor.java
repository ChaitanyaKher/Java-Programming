public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,24));
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
}

