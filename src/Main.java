import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 5000;
        boolean resultOk = false;
        int pos = -1;

        Scanner in = new Scanner( System.in );
        System.out.println( "Enter your number: " );
        int num = in.nextInt( );

        for ( int i = 0 ; i < n && pos == -1 ; i++ ) {
            if (i == num) {
                pos = i;
                resultOk = true;
            }
        }

        if (resultOk) {
            System.out.println( "Element is found " + pos );
        } else System.out.println( "Element is not found" );
    }
}
