class Forincrement{
int i=1;
public void test(){
while(i<=8){
System.out.println("value of i:"+i);
i++; 
}
System.out.println("finishing executing the Forincremen");
}
public static void main(String[]args){
Forincrement f=new Forincrement();
f.test();
}
}