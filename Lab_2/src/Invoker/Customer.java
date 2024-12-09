package Invoker;

public record Customer(String name) {

    public void makeOrder(Waiter waiter, String dish) {
        System.out.println("🧑 Посетитель " + name + " заказывает: " + dish);
        waiter.takeOrder(this, dish);
    }
}

/* Можно преобразовать в record - класс, предназначенный для хранения данных */