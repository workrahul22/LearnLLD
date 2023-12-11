package LLD5Example2DecoratorOrWrapperDesign;

public class Client {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBase();
        pizza = new Cheese(pizza);
        pizza = new PaneerTopping(pizza);
        pizza = new Cheese(pizza);
        pizza = new Sauce(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getComposition());

    }
}
