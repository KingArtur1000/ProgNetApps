package Invoker;

import Command.FoodOrder;
import Command.OrderCommand;
import Receiver.Chef;

public class Waiter {
    private OrderCommand currentOrder;
    private final Chef chef;

    public Waiter(Chef chef) {
        this.chef = chef;
    }

    public void takeOrder(Customer customer, String dish) {
        System.out.println("👨‍🍳 Официант принимает заказ от посетителя по имени: " + customer.name() + " - " + dish);
        this.currentOrder = new FoodOrder(chef, dish);
    }

    public void sendOrderToKitchen() {
        if (currentOrder != null) {
            System.out.println("📝 Официант передает заказ на кухню: " + currentOrder.getOrderDetails());
            currentOrder.execute();
        }
    }
}