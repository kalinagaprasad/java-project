class Switchex{
String fun;
int a,b,c;
public void store(String x,int y,int z){
fun=x;
a=y;
b=z;
System.out.println("Function you selected is:"+fun);
}
public void test(){
switch(fun){
case"add":
c=a+b;
System.out.println("Addition of two numbers"+c);
case"sub":
c=a-b;
System.out.println("Substraction of two numbers"+c);
case"mul":
c=a*b;
System.out.println("Multiplication of two numbers"+c);
case"div":
c=a%b;
System.out.println("Division of two numbers"+c);
default:
System.out.println("No function is selected");
}
}
public static void main(String[] args){
Switchex p=new Switchex();
p.store("add",100,36);
p.test();
}
}