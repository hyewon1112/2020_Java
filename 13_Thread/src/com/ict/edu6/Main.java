package com.ict.edu6;

public class Main {
   public static void main(String[] args) {
      Car car = new Car();
      Producer producer = new Producer(car);
      Thread tProducer = new Thread(producer);
      Customer customer = new Customer(car);
      
      Thread tCustomer = new Thread (customer);
      tProducer.start();
      tCustomer.start();
      
   }
}