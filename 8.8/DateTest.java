package datetest;
/**
 *
 * @author Phan
 */
public class DateTest {
    public static void main(String[] args) {
        Date a = new Date(06,30,2014);    
        System.out.println("Ngay da nhap la :"+a.toString());
        a.nextday();
        System.out.println("Ngay sau khi da tang 1 ngay la :"+a.toString()); 
        for(int i =1; i<=30;i++)
        a.nextday();
        System.out.println("Ngay sau khi da tang 1 thang la :"+a.toString()); 
        for(int i =1;i<=365;i++)
        a.nextday();
        System.out.println("Ngay sau khi da tang 1 nam la :"+a.toString());
    }
    
}
