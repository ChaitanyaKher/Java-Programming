public class Palindrome{
    public static void main(String[] args) {
        isPalindrome(-127);
        for ( int i =100; i <201; i++)
            isPalindrome(i);
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse = 0;
        // extracting last digit
        while (number!=0) {
            reverse = reverse *10+number%10;
            number/=10;
        }
        System.out.println(reverse+" ");
        if (reverse == originalNumber) return true;
        else return false;
    }
}
