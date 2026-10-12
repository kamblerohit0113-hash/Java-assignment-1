import java.util.Scanner;
public class Q2_Armstrong_Numbers_In_Range {
 static int digits(int n){int c=0;do{c++;n/=10;}while(n>0);return c;}
 static long power(int b,int e){long r=1;for(int i=0;i<e;i++)r*=b;return r;}
 static boolean armstrong(int n){int t=n,k=digits(n);long sum=0;while(t>0){sum+=power(t%10,k);t/=10;}return sum==n;}
 public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Start: ");int x=s.nextInt();System.out.print("End: ");int y=s.nextInt();
  if(x<1||y<1||x>y)System.out.println("Enter positive integers with Start <= End.");
  else{System.out.print("Armstrong numbers: ");boolean found=false;for(int n=x;n<=y;n++){if(armstrong(n)){System.out.print(n+" ");found=true;}if(n==Integer.MAX_VALUE)break;}if(!found)System.out.print("None");System.out.println();}}
}
