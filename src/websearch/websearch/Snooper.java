package websearch.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
	
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
        	
        	FilterStrategy strategy = new StringFilterStrategy("friend");
        	
            @Override
            public void onQuery(String query) {
            	if(strategy.hasInterest(query)) {
                System.out.println("Oh yes! " + query);
            	
            	} 
            
            }

			@Override
			public void chooseStrategy(FilterStrategy strategy) {
				// TODO Auto-generated method stub
				this.strategy = strategy;
				
			}
        });
        
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
        	
        	FilterStrategy strategy = new LengthFilterStrategy(60);
        	
            @Override
            public void onQuery(String query) {
            	if(strategy.hasInterest(query)) {
                System.out.println("So long... " + query);
            	}
            }

			@Override
			public void chooseStrategy(FilterStrategy strategy) {
				// TODO Auto-generated method stub
				this.strategy = strategy;
				
			}
        });
        
    }
}
