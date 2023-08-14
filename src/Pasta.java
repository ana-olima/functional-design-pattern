import java.util.Arrays;
import java.util.List;

public class Pasta {

    private final List<String> toppings;
    private final List<String> sauces;
    private final Size size;
    private final boolean cheese;
    private final boolean tomato;

    public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean tomato) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.tomato = tomato;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public Size getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "toppings=" + toppings +
                ", sauces=" + sauces +
                ", size=" + size +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                '}';
    }
    public static class Builder{

        protected Size size;
        protected List<String> toppings;
        protected List<String> sauces;
        protected boolean cheese;
        protected boolean tomato;

        public Builder(Size size) {
            this.size = size;
        }
        public Builder withToppings(String toppings){
            this.toppings = Arrays.asList(toppings);
            return this;
        }
        public Builder withSauces(String sauces){
            this.sauces = Arrays.asList(sauces);
            return this;
        }
        public Builder withCheese(){
            this.cheese = cheese;
            return this;
        }
        public Builder withTomato(){
            this.tomato = tomato;
            return this;
        }
        public Pasta now(){
            return new Pasta(toppings,sauces,size,cheese,tomato);
        }
    }
}
