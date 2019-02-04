package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public  Order retrieveOrder() {

        User user = new User("Jan","Kowalski", 111, "email@google.de", "Germany");
        Basket basket = new Basket(new Product("Phone",1), 2);

            System.out.println("Order for: "+user.getName()+" "+user.getSurname());
            System.out.println("\n" + basket.getProduct().getItem() + "\n" + "Quantity: " + basket.getQuantity());
            return new Order(user,basket);
    }
}