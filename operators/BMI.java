import java.util.Scanner;
class BMI{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter weight in pounds");
double weight=sc.nextFloat();
System.out.println("enter Height in inches");
weight=weight*0.45359;
double height=sc.nextFloat();
height=height*0.0254;
double Bmi=weight/(height*height);
System.out.println("BMI is:"+Bmi);

}
}