import java.util.Scanner;
public class Q4_Prime_Factorization {
 public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Number: ");long n=s.nextLong();
  if(n<1)System.out.println("Please enter an integer greater than or equal to 1.");
  else if(n==1)System.out.println("Prime factorization: 1 has no prime factors.");
  else{long t=n,f=2;boolean first=true;System.out.print("Prime factorization: ");
   while(f<=t/f){int c=0;while(t%f==0){t/=f;c++;}if(c>0){if(!first)System.out.print(" x ");System.out.print(f+"^"+c);first=false;}f=(f==2)?3:f+2;}
   if(t>1){if(!first)System.out.print(" x ");System.out.print(t+"^1");}System.out.println();}}
}
