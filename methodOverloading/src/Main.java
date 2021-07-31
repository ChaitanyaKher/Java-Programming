public class Main {
    public static void main(String[] args) {
        int score = calculateScore("Chaitanya", 100);
        System.out.println("New Score is "+ score);
        calculateScore(100);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(11));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" score "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet>=0&&(inches>=0&&inches<=12)){
            //1f 12 inch 1inch 2.54cm
            double convFt = feet*12*2.54;
            double convIn = inches*2.54;
            double totalCms = convFt+convIn;
            return (int) totalCms;
        }
        else {
            return -1;
        }
    }

    public static int calcFeetAndInchesToCentimeters(int inches){
        if (inches>=0){
            //1f 12 inch 1inch 2.54cm
            double convFt = (inches*12)/100;
            int totalCms=calcFeetAndInchesToCentimeters((int) convFt,inches);
            return totalCms;
        }
        else {
            return -1;
        }
    }
}
