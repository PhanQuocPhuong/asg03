package savingsaccounttest;

/**
 *
 * @author Phan
 */

public class SavingsAccountTest {
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(4,2000);
        SavingsAccount saver2 = new SavingsAccount(4,3000);
        System.out.printf("lai thang nay la :%.2f",saver1.calculateMonthlyInterest());
        System.out.printf("\nso tien du cua tai khoan 1 la :%.2f",saver1.getsavingsBalance());
        System.out.printf("\nso tien du cua tai khoan 2 la :%.2f",saver2.getsavingsBalance());
        saver1.modifyInterestRate(5);
        saver2.modifyInterestRate(5);
        System.out.printf("\nlai thang tiep theo la :%.2f",saver1.calculateMonthlyInterest());
        System.out.printf("\nso tien du cua tai khoan 1 la :%.2f",saver1.getsavingsBalance());
        System.out.printf("\nso tien du cua tai khoan 2 la :%.2f",saver2.getsavingsBalance());
    }
    
}
