import java.util.Scanner;
class area_rectangle{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
System.out.println("enter height:");
float h=sc.nextFloat();
System.out.println("enter width");
Float w=sc.nextFloat();
float area=h*w;
float perimeter=2*(h+w);
System.out.println("AREA : "+area+" " +" Perimeter :"+perimeter);
}}