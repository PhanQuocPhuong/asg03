/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time2test;

/**
 *
 * @author Phan
 */
public class Time2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        time2 t1 = new time2();             
        time2 t2 = new time2( 1 );          
        time2 t3 = new time2( 22, 55 );     
        time2 t4 = new time2( 23, 34, 00 ); 
        time2 t5 = new time2( 25, 78, 89 ); 
        time2 t6 = new time2( t4 );        
        System.out.println( "Constructed with:" );
        System.out.println( "Time1: all arguments defaulted" );
        System.out.printf( "   %s\n", t1.toUniversalString() );
        System.out.printf( "   %s\n", t1.toString() );

        System.out.println("Time2: hour specified; minute and second defaulted" );
        System.out.printf( "   %s\n", t2.toUniversalString() );
        System.out.printf( "   %s\n", t2.toString() );

        System.out.println("Time3: hour and minute specified; second defaulted" );
        System.out.printf( "   %s\n", t3.toUniversalString() );
        System.out.printf( "   %s\n", t3.toString() );

        System.out.println( "Time4: hour, minute and second specified" );
        System.out.printf( "   %s\n", t4.toUniversalString() );
        System.out.printf( "   %s\n", t4.toString() );
        System.out.println( "Time5: all invalid values specified" );
        System.out.printf( "   %s\n", t5.toUniversalString() );
        System.out.printf( "   %s\n", t5.toString() );

        System.out.println( "Time6: Time2 object t4 specified" );
        System.out.printf( "   %s\n", t6.toUniversalString() );
        System.out.printf( "   %s\n", t6.toString() );
    }
    
}
