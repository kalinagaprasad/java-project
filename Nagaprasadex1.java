class Nagaprasadex1 {
int age;
String name;
float salary;
char g;
public void store(int a,String n,float s,char ge){
System.out.println("Started executing the store method");
age = a;
name = n;
salary = s;
g = ge;
System.out.println("Finishing executing the store methid");
}
public void Display(){
System.out.println("name is :"+name+"age is:"+age);
System.out.println("Salary is :"+salary+"ge is:"+g);
}
public static void main(String[]args){
 Nagaprasadex1 n = new Nagaprasadex1();
 n.store(21,"king",2100.500f,'m');
 n.Display();
}
}

