public class Main {
    public static void main(String[] args) {

        //Pizza pizza = new Pizza();
        //Pizza pizza = new Pizza("thick crust");
        //Pizza pizza = new Pizza("thick crust", "tomatoes");
        //Pizza pizza = new Pizza("thick crust", "tomatoes","mozzarella");
        Pizza pizza = new Pizza("thick crust", "tomatoes","mozzarella","pepperoni");

        System.out.println("Here are the ingredients of your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}