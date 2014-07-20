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
public class time2 {
    private int second;
    public time2()                                                      
      {                                                                   
         second=0; 
      } 
    public time2( int h )                                                
      {                                                                    
        second=h*3600; 
      } 
    public time2( int h, int m )                                         
      {                                                                    
         second=3600*h+60*m; 
      }  
    public time2( int h, int m, int s )                      
      {                                                        
         setTime( h, m, s ); 
      }           
      public time2( time2 time )                                    
      {                                                             
         // invoke Time2 three-argument constructor                 
         this( time.getHour(), time.getMinute(), time.getSecond() );
      } 
      public void setTime( int h, int m, int s )
      {
         setHour( h );   // set the hour
         setMinute( m ); // set the minute
         setSecond( s ); // set the second
      } 
      public void setHour( int h )
      {
         second =second + 3600* ( ( h >= 0 && h < 24 ) ? h : 0 );
      } 
      public void setMinute( int m )
      {
         second =second+ 60*( ( m >= 0 && m < 60 ) ? m : 0 );
      } 
      public void setSecond( int s )
      {
         second =second + ( ( s >= 0 && s < 60 ) ? s : 0 );
      } // end method setSecond
 
      
      public int getHour()
      {
         return (second/3600);
      } 
      public int getMinute()
      {
         return ((second-3600*getHour())/60);
      } 
      public int getSecond()
      {
         return (second-3600*getHour()-60*getMinute());
      }
      public String toUniversalString()
      {
         return String.format(
            "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
      } 
      public String toString()
      {
         return String.format( "%d:%02d:%02d %s",
           ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
           getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" )  );
     } // end method toString
}
