public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(193,16,34));
    }

    public static boolean hasSameLastDigit(int firstNumber,int secondNumber, int thirdNumber){
        if (isValid(firstNumber)&&isValid(secondNumber)&&isValid(thirdNumber)){
            int firstNumberLastDigit = firstNumber%10;
            int secondNumberLastDigit = secondNumber%10;
            int thirdNumberLastDigit = thirdNumber%10;

            if (firstNumberLastDigit == secondNumberLastDigit|| secondNumberLastDigit == thirdNumberLastDigit||firstNumberLastDigit == thirdNumberLastDigit){
                return true;
            } else return false;
        }
        return false;
    }

    public static boolean isValid(int number){
        return (number>=10&&number<=1000)?true:false;
    }
}
