package savingsaccounttest;

/**
 *
 * @author Phan
 */
public class SavingsAccount {
    private 
    double annualInterestRate; //lai suat theo nam
    double savingsBalance;     //so tien hien co
    public SavingsAccount(){ //tao cac gia tri
        annualInterestRate = 0;
        savingsBalance = 0;
    }
    public double getsavingsBalance(){ //lay cac gia tri tai khoan hien co
        return savingsBalance;
    }
    public SavingsAccount(double a,double b){
        annualInterestRate=a;
        savingsBalance=b;
    }
    public double calculateMonthlyInterest(){
        double temp;
        temp=(annualInterestRate*savingsBalance)/12;
        savingsBalance=savingsBalance=temp;
        return temp;
    }
    public void modifyInterestRate(double k){
        annualInterestRate=k;
    }
}
