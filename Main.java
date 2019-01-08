package com.tejam;

public class Main {

    public static void main(String[] args) {
        System.out.println( area(-18));
        System.out.println(area(2,4 ));

    }
    private static double area(double radius){

        if (radius < 0 ){

            return -1;
        }
        else
            return (3.14 * radius * radius);


    }
    private static double area (double length, double width){

        if ((length <0) || (width<0)){
            return -1;
            } else{
                return length*width;}


    }
}
