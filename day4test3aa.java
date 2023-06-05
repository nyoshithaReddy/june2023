import java.util.Scanner;
class test3aa{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int inc=sc.nextInt();
for(int i=0;i<=num;i=i+inc)
{
str=str+i+",";
System.out.print(i);
if(i<num)System.out.print(",");
}
}
}