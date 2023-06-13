public class MultipleCatchBlock1{
public static void (String args[]){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException occurs");}
catch(ArrayIndexOutOfboundsexception e0
{
System.out.println("ArrayIndexOutOfBounds exception occurs");}
catch(Exception e)
{
System.out.println("Parent Exception occurs");
}
System.out.println("rest of the code");
}
}