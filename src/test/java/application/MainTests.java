package application;

import application.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import application.flower.CactusFlower;
import application.flower.Flower;
import application.flower.FlowerBucket;
import application.flower.RomashkaFlower;
import application.decorators.BasketDecorator;
import application.decorators.PaperDecorator;
import application.decorators.RibbonDecorator;


public class MainTests {
    private Item item;
    private Item flowerBucket;

    @Test
    public void testBasket() {
        item = new Flower(1, "blue", 200, 200);
        item.setDescription("Beautiful flower");

        flowerBucket = new FlowerBucket();
        FlowerBucket.addFlowers(new RomashkaFlower(2, "blue", 200, 200));
        FlowerBucket.addFlowers(new CactusFlower(2, "blue", 200, 200));
        flowerBucket.setDescription("Beautiful bucket");

       item = new BasketDecorator(item);
       Assertions.assertEquals("Beautiful flower with Basket decorator", item.getDescription());

       flowerBucket = new BasketDecorator(flowerBucket);
       Assertions.assertEquals("Beautiful bucket with Basket decorator", flowerBucket.getDescription());
    }

    @Test
    public void testPaper() {
        item = new Flower(1, "blue", 200, 200);
        item.setDescription("Beautiful flower");

        flowerBucket = new FlowerBucket();
        FlowerBucket.addFlowers(new RomashkaFlower(2, "blue", 200, 200));
        FlowerBucket.addFlowers(new CactusFlower(2, "blue", 200, 200));
        flowerBucket.setDescription("Beautiful bucket");

        item = new PaperDecorator(item);
        Assertions.assertEquals("Beautiful flower with Paper decorator", item.getDescription());

        flowerBucket = new PaperDecorator(flowerBucket);
        Assertions.assertEquals("Beautiful bucket with Paper decorator", flowerBucket.getDescription());
    }

    @Test
    public void testRibbon() {
        item = new Flower(1, "blue", 200, 200);
        item.setDescription("Beautiful flower");

        flowerBucket = new FlowerBucket();
        FlowerBucket.addFlowers(new RomashkaFlower(2, "blue", 200, 200));
        FlowerBucket.addFlowers(new CactusFlower(2, "blue", 200, 200));
        flowerBucket.setDescription("Beautiful bucket");

        item = new RibbonDecorator(item);
        Assertions.assertEquals("Beautiful flower with Ribbon decorator", item.getDescription());

        flowerBucket = new RibbonDecorator(flowerBucket);
        Assertions.assertEquals("Beautiful bucket with Ribbon decorator", flowerBucket.getDescription());
    }
}
