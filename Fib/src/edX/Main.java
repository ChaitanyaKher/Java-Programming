package edX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        d = in.nextInt();
        for  (a=0,b=1,c=a;a<d;c=a,a+=b,b=c){
            System.out.println(a);
        }
    }
}
