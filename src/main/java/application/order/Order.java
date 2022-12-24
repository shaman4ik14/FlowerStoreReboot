package application.order;

import application.item.Item;
import application.delivery.Delivery;
import application.payments.Payment;
import application.users.MyUser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private List<MyUser> myUserList;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
        System.out.println("Payment is done by " + payment.getClass().getSimpleName());
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
        System.out.println("Payment is done by " + delivery.getClass().getSimpleName());
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item: items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void order() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
            notifyUsers();
            myUserList = new ArrayList<>();
            System.out.println("The Items are paid and delivered successfully! The Users are notified");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(Item item) {
        items.remove(item);
        return item;
    }

    public void addUser(MyUser user) {
        myUserList.add(user);
    }

    public void removeUser(MyUser user) {
        for (MyUser userFromList: myUserList) {
            if (userFromList.getEmail().equals(user.getEmail())) {
                myUserList.remove(userFromList);
            }
        }
    }

    public void notifyUsers() {
        for (MyUser user: myUserList) {
            user.update("notified");
        }
    }
}
