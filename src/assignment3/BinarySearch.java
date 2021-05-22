package assignment3;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int n = 5000;
        boolean resultOk = false;
        int pos = -1;
        int first = 0;
        int last = n - 1;
        int middle;

        Scanner in = new Scanner( System.in );
        System.out.println( "Enter your number: " );
        int num = in.nextInt( );

        while (last > first) {
            middle = ( first + last ) / 2;

            if (num == middle) {
                first = middle;
                last = first;
                resultOk = true;
                pos = middle;
            } else {
                if (num > middle) {
                    first = middle + 1;
                } else {
                    first = middle - 1;
                }
            }
        }

        if (resultOk) {
            System.out.println( "Element is found: " + pos );
        } else System.out.println( "Element is not found" );
    }
}