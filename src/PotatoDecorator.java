package src;

class PotatoDecorator extends DishDecorator {
    public PotatoDecorator(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with potato";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}