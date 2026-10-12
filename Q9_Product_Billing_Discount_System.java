import java.util.Scanner;
class Product {
 private String name;private int id,quantity;private double price;
 Product(String n,int i,double p,int q){if(p<0)throw new IllegalArgumentException("Price cannot be negative.");if(q<=0)throw new IllegalArgumentException("Quantity must be positive.");name=n;id=i;price=p;quantity=q;}
 double subtotal(){return price*quantity;} double discount(){double t=subtotal();if(t<1000)return 0;if(t<5000)return t*.05;if(t<10000)return t*.10;return t*.15;}
 double finalBill(){return subtotal()-discount();}
 void display(){System.out.println("Product Name: "+name);System.out.println("Product ID: "+id);System.out.println("Subtotal: "+subtotal());System.out.println("Discount: "+discount());System.out.println("Final Bill: "+finalBill());}
}
public class Q9_Product_Billing_Discount_System {
 public static void main(String[] x){Scanner s=new Scanner(System.in);try{System.out.print("Product: ");String n=s.nextLine();System.out.print("Product ID: ");int id=s.nextInt();System.out.print("Unit Price: ");double p=s.nextDouble();System.out.print("Quantity: ");int q=s.nextInt();new Product(n,id,p,q).display();}catch(IllegalArgumentException e){System.out.println("Invalid input: "+e.getMessage());}}
}
