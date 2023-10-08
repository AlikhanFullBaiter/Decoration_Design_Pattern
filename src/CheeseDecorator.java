package src;

class CheeseDecorator extends DishDecorator {
    public CheeseDecorator(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.4;
    }
}