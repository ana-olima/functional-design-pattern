public class Client {


    public static void main(String[] args) {

        Pasta p1 = new Pasta.Builder(Size.SMALL).now();
        System.out.println(p1);

        Pasta p2 = new Pasta.Builder(Size.STANDARD)
                .withToppings("Arugula with dried tomato")
                .withSauces("Tomato")
                .withCheese()
                .withTomato()
                .now();

        System.out.println(p2);

        Pasta p3 = new Pasta.Builder(Size.LARGE)
                .withToppings("Bacon")
                .withSauces("Cheese")
                .withCheese()
                .withTomato()
                .now();
        System.out.println(p3);
        }
}
