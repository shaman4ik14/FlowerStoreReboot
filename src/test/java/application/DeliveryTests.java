package application;

import application.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import application.delivery.DHLDeliveryStrategy;
import application.delivery.PostDeliveryStrategy;
import application.flower.CactusFlower;
import application.flower.FlowerBucket;
import application.flower.RomashkaFlower;

import java.util.LinkedList;

public class DeliveryTests {
    private LinkedList<Item> items;
    PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
    DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();

    @BeforeEach
    public void init() {
        items = new LinkedList<>();

        items.add(new RomashkaFlower(1, "white", 5, 200));

        FlowerBucket additionalBucket = new FlowerBucket();
        additionalBucket.addFlowers(new CactusFlower(4, "blue", 5, 200));
        additionalBucket.addFlowers(new RomashkaFlower(3, "white", 5, 200));
        items.add(additionalBucket);
    }

    @Test
    public void testDHL() {
        dhlStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }

    @Test
    public void testPost() {
        postStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }
}
