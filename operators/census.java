import java.util.*;
class census{
public static void main(String []args)
{
long c_pop=312032486;
final long seconds=(365*24*60*60)*5;
long birth=seconds/7;
long death =seconds/13;
long imm=seconds/45;
long newpop=c_pop+birth-death+imm;
System.out.println("the new popiulation after 5 years will be :"+newpop);

}
}