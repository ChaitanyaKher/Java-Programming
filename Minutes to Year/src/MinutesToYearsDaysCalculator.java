public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        }else {
            long year = minutes%525600;
            long day = minutes%1440;
            System.out.println(minutes+" min = "+(int)year+" y and "+(int)day+" d");
        }
    }
}