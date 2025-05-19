class Simple{
int i=3;
public void test(){
while(i>0){
System.out.println("3:"+i);
i=i*3;
}
System.out.println("Finished executing the Simple");
}
public static void main(String[]args){
Simple w=new Simple();
w.test();
}
}
