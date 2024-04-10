package bakery;


public abstract class CakeDecorator extends Cake {
    protected Cake cake;

    public CakeDecorator (Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public abstract String getDescription();


}