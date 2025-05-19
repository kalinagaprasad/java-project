class Person{
   int age;
   String name;
   float salary;
   char g;
public void saveDetails(int a,String n,float s,char ge){
System.out.println("Started executing the saveDetails method");
   age = a;
   name = n;
   salary = s;
   g = ge;
  System.out.println("Finished executing the saveDetails method");
  }
  public void Display(){
  System.out.println("Name is:"+name+"Age is:"+age);
  System.out.println("Salary is:"+salary+"Gender is:"+g);
  }
  public static void main(String[]args){
   Person P = new Person();
   P.saveDetails(23,"naga",50322.235f,'m');
   P.Display();
  }
}
