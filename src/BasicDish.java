package src;

class BasicDish implements Dish {
    private String description;
    private double cost;

    public BasicDish(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}