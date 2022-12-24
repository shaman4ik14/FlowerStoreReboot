package application.delivery;

import application.item.Item;

import java.util.LinkedList;

public interface Delivery {
     public void deliver(LinkedList<Item> flowerList);
}
