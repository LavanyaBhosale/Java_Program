import java.util.Scanner;
class CompareNum{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int n1=sc.nextInt();
int n2=sc.nextInt();
String opt=(n1>n2)?(n1+">"+n2):((n1>=n2)?(n1+">="+n2):((n1<n2)?(n1+"<"+n2):((n1<=n2)?(n1+"<="+n2):("____"))));
System.out.println(opt);

}
}