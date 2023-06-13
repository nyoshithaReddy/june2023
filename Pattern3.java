import java.util.Scanner;
class Main
{
public static void printLine(int start,int stop){
for(int i=start;i<stop;i++){System.out.print(i);}
}
public static void printPattern3(int n){
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(0,0);System.out.print("\n");
printLine(1,2);System.out.print("\n");
printLine(3,5);System.out.print("\n");
printLine(6,9);System.out.print("\n");
}
}


