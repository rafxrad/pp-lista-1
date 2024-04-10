package bakery;


public class SayingCakeDecorator extends CakeDecorator{
    private final String saying;

    public SayingCakeDecorator(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + saying;
    }
}