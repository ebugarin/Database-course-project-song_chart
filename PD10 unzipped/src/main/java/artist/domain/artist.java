package artist.domain;

/**
 * artist object
 * 
 * @author eric bugarin
 * 
 */
public class artist {
	/*
	 * Correspond to the user table
	 */
	
	private String nationality;
    private String artist_name; 
    private int artistID;
    private int num_albums;
    private int num_awards;
  // getters and setters
    public String getNationality() {
		return nationality;
	}






	public void setNationality(String nationality) {
		this.nationality = nationality;
	}






	public String getArtist_name() {
		return artist_name;
	}






	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}






	public int getArtistID() {
		return artistID;
	}






	public void setArtistID(int i) {
		this.artistID = i;
	}






	public int getNum_albums() {
		return num_albums;
	}






	public void setNum_albums(int num_albums) {
		this.num_albums = num_albums;
	}






	public int getNum_awards() {
		return num_awards;
	}






	public void setNum_awards(int num_awards) {
		this.num_awards = num_awards;
	}






	@Override
    public String toString() {
        return "ArtistID [ artistID=" + artistID + ", artist name is ="
                + artist_name + ", nationality=" + nationality +"]" + "has total albums = " + num_albums + "with num of awards = " + num_awards + ".";
    }
}
