import java.util.Scanner;
public class Q1_Second_Largest_Distinct_Digit {
 static int secondLargest(long n) {
  int first=-1, second=-1;
  while(n>0){ int d=(int)(n%10);
   if(d>first){second=first;first=d;}
   else if(d<first && d>second) second=d;
   n/=10;
  } return second;
 }
 public static void main(String[] a){
  Scanner s=new Scanner(System.in); System.out.print("Number: "); long n=s.nextLong();
  if(n<=0) System.out.println("Please enter a positive integer.");
  else {int d=secondLargest(n); if(d<0)System.out.println("Fewer than two distinct digits exist.");
   else System.out.println("Second-largest distinct digit: "+d);}
 }
}
