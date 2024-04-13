package websearch.websearch;

public class StringFilterStrategy implements FilterStrategy {
	
	private String string;

	public StringFilterStrategy(String string) {
		this.string = string;
	}

	@Override
	public boolean hasInterest(String query) {
		// TODO Auto-generated method stub
		return query.toLowerCase().contains(this.string) ? true: false;
	}
	
	

}
