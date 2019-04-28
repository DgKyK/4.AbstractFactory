import food.entity.Desert;
import food.entity.Dish;
import food.entity.Drink;

public class TestClass {
    public static void main(String[] args) {
        FoodFactory myFood = myLifeStyle("Junk");
        Drink drink = myFood.getDrink();
        Dish dish = myFood.getDish();
        Desert desert = myFood.getDesert();

        drink.drink();
        dish.eat();
        desert.taste();
    }

    public static FoodFactory myLifeStyle(String foodType) {
        if(foodType.equals("Healthy")) {
            return new HealthyFoodFactory();
        } else if(foodType.equals("Junk")) {
            return  new JunkFoodFactory();
        } else {
            throw new RuntimeException("Unsupported type of food : " + foodType);
        }
    }
}
