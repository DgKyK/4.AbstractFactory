package food.entity;

public abstract class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
