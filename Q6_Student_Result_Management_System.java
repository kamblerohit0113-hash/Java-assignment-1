import java.util.Scanner;
class Student {
 private String name; private int roll,m1,m2,m3,m4,m5;
 Student(String n,int r,int a,int b,int c,int d,int e){if(!valid(a)||!valid(b)||!valid(c)||!valid(d)||!valid(e))throw new IllegalArgumentException("Marks must be 0 to 100.");name=n;roll=r;m1=a;m2=b;m3=c;m4=d;m5=e;}
 private boolean valid(int m){return m>=0&&m<=100;}
 public String getName(){return name;} public void setName(String n){name=n;}
 public int getRoll(){return roll;} public void setRoll(int r){roll=r;}
 int total(){return m1+m2+m3+m4+m5;} double percentage(){return total()/5.0;}
 String status(){return m1>=40&&m2>=40&&m3>=40&&m4>=40&&m5>=40?"PASS":"FAIL";}
 void display(){System.out.println("Student Name: "+name);System.out.println("Roll Number: "+roll);System.out.println("Total Marks: "+total()+"/500");System.out.println("Percentage: "+percentage()+"%");System.out.println("Result: "+status());}
}
public class Q6_Student_Result_Management_System {
 public static void main(String[] x){Scanner s=new Scanner(System.in);try{System.out.print("Name: ");String n=s.nextLine();System.out.print("Roll Number: ");int r=s.nextInt();System.out.println("Enter marks for 5 subjects (0-100):");Student st=new Student(n,r,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());st.display();}catch(IllegalArgumentException e){System.out.println("Invalid input: "+e.getMessage());}}
}
