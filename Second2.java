class First2 implements Runnable
{
Thread t;String S;
First2(String Name){
S=Name;
t=new Thread(this,S);
System.out.println("CHILD:"+t);
t.start();
}
public void run(){
try{for(int i=5;i>0;i--){
System.out.println(S+":"+i);
Thread.sleep(1000);}
}
catch(InterruptedException e){}
System.out.println("EXITING "+S);
}
}
class Second2
{
public static void main(String args[])throws Exception
{
new First2("ONE");
new First2("TWO");
new First2("THREE");
try{
Thread.sleep(20000);
}
catch(InterruptedException e){}
System.out.println("EXITING MAIN");
}
}
