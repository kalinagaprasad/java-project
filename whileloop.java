class whileloop{
int i=3;
public void test(){
while(i>0){
System.out.println("value of I:"+i);
i=i-1;
}
System.out.println("Finished executing the whileloop");
}
public static void main(String[]args){
whileloop w=new whileloop();
w.test();
}
}
