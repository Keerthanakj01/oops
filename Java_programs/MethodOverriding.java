public class MethodOverriding {
    
    void display(int a) {
        System.out.println("int parameter: " + a);
    }

    void display(double a) {
        System.out.println("double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.display(5);
        obj.display(5.5);
    }
}