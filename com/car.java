package com;

public class car {
  public static void main(String[] args) {
    car c = new car();
    car c1= new car();
    c.equals(c1);
    
    System.out.println(c.toString());
    System.out.println(c.equals(c1));
    System.out.println(c.hashCode());
  }
  
}