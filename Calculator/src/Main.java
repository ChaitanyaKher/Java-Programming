public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(95.23);
        calc.setSecondNumber(675.21231321);
        System.out.println("The first number is "+calc.getFirstNumber()+" and the second number is "+calc.getSecondNumber());
    }
}
