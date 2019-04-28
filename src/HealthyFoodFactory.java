import food.entity.Desert;
import food.entity.Dish;
import food.entity.Drink;
import healthy.food.MineralWater;
import healthy.food.Pasta;
import healthy.food.Sharlott;

public class HealthyFoodFactory implements FoodFactory {
    @Override
    public Drink getDrink() {
        return new MineralWater();
    }

    @Override
    public Dish getDish() {
        return new Pasta();
    }

    @Override
    public Desert getDesert() {
        return new Sharlott();
    }
}
