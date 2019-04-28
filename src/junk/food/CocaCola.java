package junk.food;

import food.entity.Drink;

public class CocaCola extends Drink {

    public CocaCola() {
        super("Coca-Cola");
    }

    public void drink() {
        System.out.println("Drinking " + this.getName());
    }
}
