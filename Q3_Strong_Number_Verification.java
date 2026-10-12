import java.util.Scanner;
public class Q3_Strong_Number_Verification {
 static int factorial(int d){int r=1;for(int i=2;i<=d;i++)r*=i;return r;}
 static boolean strong(int n){int original=n,sum=0;while(n>0){sum+=factorial(n%10);n/=10;}return sum==original;}
 public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Number: ");int n=s.nextInt();
  if(n<1)System.out.println("Please enter a positive integer.");else if(strong(n))System.out.println(n+" is a Strong Number.");else System.out.println(n+" is not a Strong Number.");}
}
