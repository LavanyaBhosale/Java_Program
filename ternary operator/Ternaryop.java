import java.util.Scanner;
class Ternaryop{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
byte a=125;
byte b=32;
byte c=89;
int result=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
System.out.println("the latgets number is :"+result);

}}