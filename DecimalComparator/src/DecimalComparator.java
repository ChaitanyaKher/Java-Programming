public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        numberOne = numberOne*1000;
        numberTwo = numberTwo*1000;
        int numOne = (int) numberOne;
        int numTwo = (int) numberTwo;

        if (numOne == numTwo){
            return true;
        } else {
            return false;
        }

    }
}
