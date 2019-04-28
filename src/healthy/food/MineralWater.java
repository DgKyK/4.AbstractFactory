package healthy.food;

import food.entity.Drink;

public class MineralWater extends Drink {

    public MineralWater() {
        super("Bon-aqua");
    }

    public void drink() {
        System.out.println("Drinking " + this.getName());
    }
}
