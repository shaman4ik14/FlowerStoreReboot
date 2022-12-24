package application.decorators;

import application.flower.Flower;
import application.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " with Basket decorator");
        return item.getDescription();
    }

    public static void main(String[] args) {
        Item firstFlower = new Flower(1, "white", 200, 200);
        firstFlower.setDescription("beautiful");
        System.out.println(firstFlower.getDescription());
        System.out.println(firstFlower.price());
        firstFlower = new BasketDecorator(firstFlower);
        System.out.println(firstFlower.getDescription());
        System.out.println(firstFlower.price());
    }
}
