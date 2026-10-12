import java.util.Scanner;
public class Q5_GCD_LCM {
 static long gcd(long a,long b){while(b!=0){long r=a%b;a=b;b=r;}return a;}
 static long lcm(long a,long b){return (a/gcd(a,b))*b;}
 public static void main(String[] x){Scanner s=new Scanner(System.in);System.out.print("First number: ");long a=s.nextLong();System.out.print("Second number: ");long b=s.nextLong();
  if(a<=0||b<=0)System.out.println("Both numbers must be positive.");else{System.out.println("GCD: "+gcd(a,b));System.out.println("LCM: "+lcm(a,b));}}
}
