package bakery;

public class SprinklesCakeDecorator extends CakeDecorator {
    public SprinklesCakeDecorator(Cake cake){
         super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
   
}