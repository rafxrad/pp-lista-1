package bakery;

public class MultiLayeredCakeDecorator extends CakeDecorator {
    public MultiLayeredCakeDecorator (Cake cake) {
        super(cake);
    }

@Override 
public String getDescription(){
    return  "Multi-layered " + cake.getDescription();
}

@Override
public int getCost(){
    return  super.getCost() + 5;
}
}