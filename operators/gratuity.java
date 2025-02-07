import java.util.Scanner;
class gratuity{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter subtotal:");
int subtotal=sc.nextInt();
System.out.println("Enter gratuity rate in %");
float gratuityrate=sc.nextFloat();
float gratuity= (gratuityrate*subtotal)/100;
float total= subtotal+gratuity;
System.out.println("the total is :"+total);
System.out.println("The gratuity is:"+gratuity);
}
}