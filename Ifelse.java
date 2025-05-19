class Ifelse{
  int age;
public void store(int x){
System.out.println("started executing the store method");
  age = x;
}
public void text(){
  if(age >=18){
System.out.println("you are age is: "+age);
System.out.println("you are eligible to vote");
}else{
System.out.println("you are age is: "+age);
System.out.println("you cannot vote");
  }
}
public static void main(String[]args){
Ifelse i=new Ifelse();
i.store(18);
i.text();
  }
}