import java.util.Scanner;
class Employee {
 private String name;private int id,rating;private double monthly;
 Employee(String n,int i,double m,int r){if(m<0)throw new IllegalArgumentException("Monthly salary cannot be negative.");if(r<1||r>5)throw new IllegalArgumentException("Rating must be 1 to 5.");name=n;id=i;monthly=m;rating=r;}
 double annual(){return monthly*12;} double bonus(){double p=rating==5?.20:rating==4?.15:rating==3?.10:rating==2?.05:0;return annual()*p;}
 void display(){System.out.println("Employee Name: "+name);System.out.println("Employee ID: "+id);System.out.println("Monthly Salary: "+monthly);System.out.println("Annual Salary: "+annual());System.out.println("Annual Bonus: "+bonus());System.out.println("Total Annual Compensation: "+(annual()+bonus()));}
}
public class Q8_Employee_Salary_Bonus_Calculator {
 public static void main(String[] x){Scanner s=new Scanner(System.in);try{System.out.print("Name: ");String n=s.nextLine();System.out.print("Employee ID: ");int id=s.nextInt();System.out.print("Monthly Salary: ");double m=s.nextDouble();System.out.print("Performance Rating: ");int r=s.nextInt();new Employee(n,id,m,r).display();}catch(IllegalArgumentException e){System.out.println("Invalid input: "+e.getMessage());}}
}
