package application.delivery;

import application.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter@Setter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        this.description = "Post Delivery Strategy";
        this.name = "Post Delivery";
    }

    @Override
    public void deliver(LinkedList<Item> flowerList) {
        flowerList.removeAll(flowerList);
        System.out.println("Items are delivered by Post");
    }
}