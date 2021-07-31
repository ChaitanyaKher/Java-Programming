package com.company;

public class Main {

    public static void main(String[] args) {
	    double var = 20.00d;
        double var1 = 80.00d;
        double result = (double) (var+var1*100);
        double rema = result%40.00d;
        boolean cond = (rema==0)?true:false;
        System.out.println(cond);
        System.out.println(cond?true:"Got some remainder");
    }
}
