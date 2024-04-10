/**
 * Create an order and print it
 */
package bakery;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new SayingCakeDecorator(new VanillaCake(), "'PLAIN!'"));
        order.addCake(new SayingCakeDecorator(new SprinklesCakeDecorator(new VanillaCake()), "'FANCY!'"));
        order.addCake(
        		new SayingCakeDecorator(
        				new SayingCakeDecorator(
        						new MultiLayeredCakeDecorator(
        								new SprinklesCakeDecorator(
        										new SprinklesCakeDecorator(
        												new StrawberryCake()
        												)
        										)
        								)
        						,"'One of'")
        				, "'EVERYTHING'")
        			);
        
        
        
        
        
        

        // Print the order
        order.printOrder();
    }
}
