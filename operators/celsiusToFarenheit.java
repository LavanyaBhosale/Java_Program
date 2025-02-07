import java.util.Scanner;
class celsiusToFarenheit{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the value in celsius: ");
float cel=sc.nextFloat();

float far =((9/5)*cel)+32;
System.out.println("the converted value is:"+far);
}
}