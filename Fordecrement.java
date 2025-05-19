class Fordecrement{
int i=7;
public void test(){
while(i>=0){
System.out.println("value of i:"+i);
i--; 
}
System.out.println("finishing executing the Forincremen");
}
public static void main(String[]args){
Fordecrement f=new Fordecrement();
f.test();
}
}
