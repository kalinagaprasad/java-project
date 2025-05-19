
class Nestedifex{
  int age;
public void store(int x){
  age=x;
  System.out.println("your age is:"+age);
}
public void text(){
  if(age>=18){
  System.out.println("You are eligible to vote");
  if(age>=25){
  System.out.println("You are eligible to participation elections");
}
  }else{
  System.out.println("You cannot vote");
}
  System.out.println("Finished executing the text method");
}
public void test(){
  /*else{
 System.out.println("Trying to omit if block");
  }*/
  if(age>5){
 System.out.println("Trying to omit else block");
  }
}
public static void main(String[] args){
Nestedifex n=new Nestedifex();
n.store(18);
n.text();
  }
}