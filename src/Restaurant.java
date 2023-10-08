package src;

public class Restaurant {
    public static void main(String[] args) {

        Dish basicDish = new BasicDish("Spaghetti Carbonara", 12.0);
        System.out.println("Ordered: " + basicDish.getDescription() + ", Cost: $" + basicDish.getCost());


        Dish dishWithCheese = new CheeseDecorator(basicDish);
        System.out.println("Ordered: " + dishWithCheese.getDescription() + ", Cost: $" + dishWithCheese.getCost());


        Dish dishWithNuts = new PotatoDecorator(basicDish);
        System.out.println("Ordered: " + dishWithNuts.getDescription() + ", Cost: $" + dishWithNuts.getCost());
    }
}