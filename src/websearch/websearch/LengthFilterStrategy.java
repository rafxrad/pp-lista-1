package websearch.websearch;

public class LengthFilterStrategy implements FilterStrategy {
	
	private Integer length;

	
	public LengthFilterStrategy(Integer length) {
		this.length = length;
	}


	@Override
	public boolean hasInterest(String query) {
		// TODO Auto-generated method stub
		return query.length() > this.length ? true : false;
	}
	
	

}
