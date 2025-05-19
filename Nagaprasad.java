class Nagaprasad {
int age;
String name;
float rent;
char g;
public void NagaprasadDetails(int a,String n,float r,char ge){
System.out.println("Started execution the nagaprasaDetails method"); 
age = a;
name = n;
rent = r;
g = ge;
System.out.println("Finishing executing the nagaprasadDetails method");
}
public void Display(){
System.out.println("Age is:"+age+"name is:"+name);
System.out.println("Rent is:"+rent+"gender is:"+g);
}
public static void main(String[] args){
Nagaprasad na = new Nagaprasad();
na.NagaprasadDetails(23,"raj",3500.250f,'m');
na.Display();
}
}