package album.domain;

import java.time.LocalTime;

/**
 * artist object
 * 
 * @author eric bugarin
 * 
 */
public class album {
	/*
	 * Correspond to the user table
	 */
	private int albumID ;  
	private int total_streams    ;
	String album_name;
	private int rating ;    
	LocalTime length;
	private int artistID ;
       
    
    public int getAlbumID() {
		return albumID;
	}




	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}




	public int getTotal_streams() {
		return total_streams;
	}




	public void setTotal_streams(int total_streams) {
		this.total_streams = total_streams;
	}




	public String getAlbum_name() {
		return album_name;
	}




	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}




	public int getRating() {
		return rating;
	}




	public void setRating(int rating) {
		this.rating = rating;
	}




	public LocalTime getLength() {
		return length;
	}




	public void setLength(LocalTime length) {
		this.length = length;
	}




	public int getArtistID() {
		return artistID;
	}




	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}




	
	
	


	@Override
    public String toString() {
        return "AlbumID [ AlbumID=" + albumID + ", album name is ="
                + album_name + ", total streams=" + total_streams +"]" + "has rating = " + rating + "length = " + length + ".";
    }
}
