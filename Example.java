public class Example{
int x;
int y;

static int z;
public void add(){
int a=12;
int b=39;
int c=a+b;
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);
}
public static void main(String[]args){
Example ex = new Example();
ex.add();
System.out.println("x="+ex.x);
System.out.println("y="+ex.y);

z = 66;
System.out.println(z);
}
}