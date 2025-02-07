import java.util.Scanner;
class ResultGrade{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter ypur marks  :");
int marks=sc.nextInt();
float percent=(marks/6);
String result=(percent>=75)?("A grade "+percent):((percent<75 && percent>=60)?
("B garde "+percent):((percent<60 && percent>=35)?("C garde "+percent):("fail")));
System.out.println(result);

}}