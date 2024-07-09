public class MethodOverloading {
    
    void display(int a) {
        System.out.println("int parameter: " + a);
    }

    void display(double a) {
        System.out.println("double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(5);
        obj.display(5.5);
    }
}
