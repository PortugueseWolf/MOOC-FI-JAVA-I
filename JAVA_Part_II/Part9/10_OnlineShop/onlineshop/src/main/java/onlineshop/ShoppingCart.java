package onlineshop;

import java.util.*;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
            return;
        }
        cart.put(product, new Item(product, 1, price));
    }

    public int price() {
        int total = 0;
        for(String calc : cart.keySet()) {
            total += cart.get(calc).price();
        }
        return total;
    }

    public void print() {
        for(String printer : cart.keySet()) {
            System.out.println(cart.get(printer));
        }
    }
}
