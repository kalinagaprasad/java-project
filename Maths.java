  
class Maths{
 int s,n,r;
public void store(int x,int y){
s=x;
n=y;
}
public void add(){
  r=s+n;
System.out.println("Addition of two no's : "+r);
}
public void sub(){
  r=s-n;
System.out.println("Subtraction of two no's : "+r);
}
public void multi(){
   r=s*n;
System.out.println("Multiplication of two no's :"+r);
}
public void div(){
  r=s/n;
System.out.println("Division of two no's :"+r);
}
public static void main(String[] args){
Maths ca = new Maths();
ca.store(18,88);
ca.add();
ca.sub();
ca.multi();
ca.div();
}
}