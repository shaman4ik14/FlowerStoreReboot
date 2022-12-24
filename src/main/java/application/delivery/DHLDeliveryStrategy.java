package application.delivery;

import application.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter @Setter
public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public DHLDeliveryStrategy() {
        name = "DHL Delivery";
        description = "DHL Delivery Strategy";
    }

    @Override
    public void deliver(LinkedList<Item> items) {
        items.removeAll(items);
        System.out.println("Items are delivered by DHL");
    }
}