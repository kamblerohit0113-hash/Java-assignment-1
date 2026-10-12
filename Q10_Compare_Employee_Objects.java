import java.util.Scanner;
class Employee {
 private String name;private int id;private double monthly;
 Employee(String n,int i,double m){if(m<0)throw new IllegalArgumentException("Salary cannot be negative.");name=n;id=i;monthly=m;}
 String getName(){return name;} double annual(){return monthly*12;}
 void compare(Employee other,String label1,String label2){if(annual()>other.annual())System.out.println(label1+" earns more than "+label2+".");else if(annual()<other.annual())System.out.println(label2+" earns more than "+label1+".");else System.out.println(label1+" and "+label2+" have equal annual salaries.");}
 Employee higherPaid(Employee other){return annual()>=other.annual()?this:other;}
}
public class Q10_Compare_Employee_Objects {
 public static void main(String[] x){Scanner s=new Scanner(System.in);try{
  System.out.println("Enter Employee 1 details:");System.out.print("Name: ");String n1=s.nextLine();System.out.print("ID: ");int i1=s.nextInt();System.out.print("Monthly salary: ");double m1=s.nextDouble();s.nextLine();
  System.out.println("Enter Employee 2 details:");System.out.print("Name: ");String n2=s.nextLine();System.out.print("ID: ");int i2=s.nextInt();System.out.print("Monthly salary: ");double m2=s.nextDouble();s.nextLine();
  System.out.println("Enter Employee 3 details:");System.out.print("Name: ");String n3=s.nextLine();System.out.print("ID: ");int i3=s.nextInt();System.out.print("Monthly salary: ");double m3=s.nextDouble();
  Employee e1=new Employee(n1,i1,m1),e2=new Employee(n2,i2,m2),e3=new Employee(n3,i3,m3);e2.compare(e1,"Employee 2","Employee 1");e2.compare(e3,"Employee 2","Employee 3");
  Employee high=e1.higherPaid(e2).higherPaid(e3);System.out.println("Highest-paid employee: "+high.getName());System.out.println("Annual Salary: "+high.annual());
 }catch(IllegalArgumentException e){System.out.println("Invalid input: "+e.getMessage());}}
}
