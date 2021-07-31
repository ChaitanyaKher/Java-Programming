public class DayOfTheWeek {
    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }
    }

    public static class NumberOfDaysInMonth {
        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if (year % 4 != 0) {
                    return false;
                } else if (year % 400 == 0) {
                    return true;
                } else if (year % 100 == 0) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }

        public static int getDaysInMonth(int month, int year) {
            int TotalDays = 0;
            if ((month>=1&&month<=12)&&(year>=1&&year<=9999)){
                switch (month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        TotalDays =31;
                        return TotalDays;
                    case 2:
                        return TotalDays = isLeapYear(year)?29:28;
                    case 4: case 6: case 9: case 11:
                        TotalDays = 30;
                        return TotalDays;
                    default:
                        return -1;
                }
            } else return -1;
        }
}

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(10,2020));
    }
}
