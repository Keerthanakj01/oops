public class This {
    private String brand;
    private double cost;

    public This(String brand,double cost){
        this.brand = brand;
        this.cost = cost;
}

    
    public String getBrand(){
        return brand;
    }
    public double getCost(){
        return cost;
    }

   public static void main(String[] args){
    This mob = new This("Redmi Note 8 pro", 16000);

    System.out.println("Mobile Brand:"+mob.getBrand());
    System.out.println("Mobile Cost:"+mob.getCost());
   }
}
