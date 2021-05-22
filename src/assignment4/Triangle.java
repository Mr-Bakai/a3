package assignment4;

public class Triangle {
    public static void main(String[] args) {
        int rows = 5;

        for ( int i = 1 ; i < rows ; i++ )
            System.out.print( " " );
        System.out.println( "*" );

        for ( int j = 2 ; j < rows ; j++ ) {
            for ( int y = 1 ; y <= rows - j ; y++ )
                System.out.print( " " );
            System.out.print( "*" );
            for ( int y = 1 ; y < j * 2 - 2 ; y++ )
                System.out.print( " " );
            System.out.println( "*" );
        }

        System.out.print( "*" );
        for ( int i = 1 ; i < rows * 2 - 2 ; i++ )
            System.out.print( "*" );
        System.out.println( "*" );
    }
}
