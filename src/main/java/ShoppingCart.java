
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anupam_pathak
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int rate = 0;

        for (Item item : this.cart.values()) {
            rate = rate + item.price();
        }
        return rate;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }

}
