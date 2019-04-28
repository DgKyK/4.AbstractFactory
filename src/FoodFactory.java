import food.entity.Desert;
import food.entity.Dish;
import food.entity.Drink;

public interface FoodFactory {
    Drink getDrink();
    Dish getDish();
    Desert getDesert();
}
