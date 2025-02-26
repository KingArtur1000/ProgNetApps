import Invoker.Customer;
import Invoker.Waiter;
import Receiver.Chef;


public class Main {
    public static void main(String[] args) {
        // Создаем повара
        Chef chef = new Chef();

        // Создаем официанта
        Waiter waiter = new Waiter(chef);

        // Создаем клиента
        Customer customer = new Customer("Алексей");

        // Клиент делает заказ
        customer.makeOrder(waiter, "Пицца Маргарита");

        // Официант передает заказ на кухню
        waiter.sendOrderToKitchen();
    }
}

