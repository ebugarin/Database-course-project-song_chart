package user.domain;

/**
 * User object
 * 
 * @author eric bugarin
 * 
 */
public class top_chart {
	/*
	 * Correspond to the user table
	 */
	
	private String date;
	private String genre; 
	private int streams;

	



	
	@Override
	public String toString() {
		return "User [ username=" + username + ", password="
				+ password + ", email=" + email +"]";
	}
}
