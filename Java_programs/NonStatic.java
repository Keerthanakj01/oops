public class NonStatic {
    
    int num;
    String str;

    {
        num = 10;
        str = "Hi I'm Keerthana";
    }

    public void display() {
        System.out.println("num: " + num);
        System.out.println("str: " + str);
    }

    public static void main(String[] args) {
        NonStatic obj = new NonStatic();
        obj.display();
    }
}