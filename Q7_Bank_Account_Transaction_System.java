import java.util.Scanner;
class BankAccount {
 private String holder;private long number;private double balance;
 BankAccount(String h,long n,double b){if(b<0)throw new IllegalArgumentException("Initial balance cannot be negative.");holder=h;number=n;balance=b;}
 boolean deposit(double a){if(a<=0){System.out.println("Deposit Rejected: amount must be positive.");return false;}balance+=a;System.out.println("Deposit Successful");return true;}
 boolean withdraw(double a){if(a<=0){System.out.println("Withdrawal Rejected: amount must be positive.");return false;}if(a>balance){System.out.println("Withdrawal Rejected: insufficient balance.");return false;}balance-=a;System.out.println("Withdrawal Successful");return true;}
 void display(){System.out.println("Account Holder: "+holder);System.out.println("Account Number: "+number);System.out.println("Final Balance: "+balance);}
}
public class Q7_Bank_Account_Transaction_System {
 public static void main(String[] x){Scanner s=new Scanner(System.in);try{System.out.print("Account Holder: ");String h=s.nextLine();System.out.print("Account Number: ");long n=s.nextLong();System.out.print("Initial Balance: ");double b=s.nextDouble();BankAccount ac=new BankAccount(h,n,b);System.out.print("Deposit: ");ac.deposit(s.nextDouble());System.out.print("Withdrawal: ");ac.withdraw(s.nextDouble());ac.display();}catch(IllegalArgumentException e){System.out.println("Invalid input: "+e.getMessage());}}
}
