import food.entity.Desert;
import food.entity.Dish;
import food.entity.Drink;
import junk.food.BubleGum;
import junk.food.CocaCola;
import junk.food.Crisps;

public class JunkFoodFactory implements FoodFactory {
    @Override
    public Drink getDrink() {
        return new CocaCola();
    }

    @Override
    public Dish getDish() {
        return new Crisps();
    }

    @Override
    public Desert getDesert() {
        return new BubleGum();
    }
}
