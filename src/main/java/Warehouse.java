
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class Warehouse {
    private Map<String,Integer> products;
    private Map<String,Integer> stockpile;
    
    public Warehouse(){
        this.products = new HashMap<>();
        this.stockpile = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stockpile.put(product, stock);
    }
    
    
    public int price(String product){
        return this.products.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.stockpile.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.stock(product) > 0){
            this.stockpile.put(product, this.stock(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }
    
    
}
