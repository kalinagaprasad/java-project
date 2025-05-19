class Forincrement{
int i=7;
public void test(){
while(i<=0){
System.out.println("value of i:"+i);
i++; 
}
System.out.println("finishing executing the Forincremen");
System.out.println("finishing executing the Forincrement");
}
public static void main(String[]args){
Forincrement f=new Forincrement();
f.test();
}
}