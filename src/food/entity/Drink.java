package food.entity;

public abstract class Drink {
    private String name;

    public Drink(String name) {
        this.name = name;
    }

    public void drink() {
        System.out.println("Drinking " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
