package pl.sdacademy.java.basic.excercises.day3.task9;

public class Order {
    private final int maxOrderItem;
    private OrderItem[] items;
    private int currentNumberItemsInOrder;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        items = new OrderItem[maxOrderItem];
        currentNumberItemsInOrder = 0;
    }

    public boolean addItem(OrderItem orderItem) {
        if (currentNumberItemsInOrder < maxOrderItem) {
            if (orderItem.isCorrect()) {
                items[currentNumberItemsInOrder] = orderItem;
                currentNumberItemsInOrder++;
                return true;
            }
        }
        System.out.println("Something is invalid");
        return false;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (OrderItem item : items) {
            totalAmount += item.getAmount();
        }
        return totalAmount;
    }

    public int getItemsCoutn() {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getQuantity();
        }
        return total;
    }
}
