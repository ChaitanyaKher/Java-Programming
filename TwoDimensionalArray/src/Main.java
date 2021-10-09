public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.start();
    }

    private void start(){
        System.out.println(check("12345"));
        System.out.println(check("123456"));
        System.out.println(check(null));
    }

    private boolean check(String aString){
        try {
            return aString.length()>5;
        }
        catch (NullPointerException e){
            System.out.println("An exception occured");
            return false;
        }
    }
}