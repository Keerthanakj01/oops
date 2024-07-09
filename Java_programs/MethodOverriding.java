class Parent{
    public void m1(){
    String FName="Keerthana";
    String LName="K J";
    int age=21;
    System.out.println("FName: "+FName+" --> LName:"+LName+" --> Age:"+age);
}
}
class Child extends Parent{
    public void m1(){
        super.m1();
        int a=1;
        int b=2;
        int sum=a=b;
        System.out.println("Sum of a and b is:"+sum);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child c=new Child();
        c.m1();
    }
    
}
