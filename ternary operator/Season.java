import java.util.Scanner;
class Season{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Month:" );
String mon=sc.next().toUpperCase();
String res=(mon.equals(" JAN")||mon.equals("OCT")||mon.equals("NOV")||mon.equals("DEC"))?("WINTER"):
((mon.equals("FEB")||mon.equals("MAR")||mon.equals("MAY")||mon.equals("APR"))?(" Summer"):
((mon.equals("JUN")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("SEP"))?("Monsoon"):("Invalid month")));
System.out.println(res);
}}