import java.util.*;
class area_circle{
public static void main(String[]args){
final float pi=22/7f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of circle in cm");
int r=sc.nextInt();
float area=pi*r*r;
System.out.println("Area of circle of radius  "+r+" is"+area+"cm^2");
}
}