public class FirstLastDigitSum {
    public static void main(String[] args) {
        for (int i=100;i<201;i++){
            System.out.println("The sum of first and last digit in "+i+" is "+sumFirstAndLastDigit(i));
        }
    }

    public static int sumFirstAndLastDigit(int number){
        if (number<0) return  -1;
        int lastDigit = number%10;
        int firstDigit =number;
        while (firstDigit>=10) {
            firstDigit /= 10;
        }
            return firstDigit+lastDigit;
    }
}
