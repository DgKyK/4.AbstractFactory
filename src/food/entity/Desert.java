package food.entity;

public abstract class Desert {
    private String name;

    public Desert(String name) {
        this.name = name;
    }

    public void taste() {
        System.out.println("Tasting " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
