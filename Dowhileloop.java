class Dowhileloop{
int i=1;
public void test(){
do{
System.out.println("Hi all.. welcome to java world..!"+i);
i++; //i=i+1
}
while(i<=3);
System.out.println("Finishing executing the dowhileloop");
}
public static void main(String[] args){
Dowhileloop d=new Dowhileloop();
d.test();
}
}

