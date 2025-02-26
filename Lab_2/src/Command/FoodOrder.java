package Command;

import Receiver.Chef;

public class FoodOrder implements OrderCommand {
    private final Chef chef;
    private final String dish;

    public FoodOrder(Chef chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }

    @Override
    public void execute() {
        chef.prepareDish(dish);
    }

    @Override
    public String getOrderDetails() {
        return dish;
    }
}