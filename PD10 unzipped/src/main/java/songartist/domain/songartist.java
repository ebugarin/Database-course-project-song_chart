package songartist.domain;

import java.time.LocalTime;

/**
 * artist object
 * 
 * @author eric bugarin
 * 
 */
public class songartist {

	private String genre;
	 private int  streams;
	 private String song_name;
	 private int   BPM;
	 private int  albumID;
	 private int  artistID;
	 
		private int albumID2 ;  
		private int total_streams    ;
		String album_name;
		private int rating ;    
		LocalTime length;
		private int artistID2 ;
	
	private int songID;
	 public int getSongID() {
		return songID;
	}








	public void setSongID(int songID) {
		this.songID = songID;
	}








	public String getGenre() {
		return genre;
	}








	public void setGenre(String genre) {
		this.genre = genre;
	}








	public int getStreams() {
		return streams;
	}








	public void setStreams(int streams) {
		this.streams = streams;
	}








	public String getSong_name() {
		return song_name;
	}








	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}








	public int getBPM() {
		return BPM;
	}








	public void setBPM(int bPM) {
		BPM = bPM;
	}








	public int getAlbumID() {
		return albumID;
	}








	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}








	public int getArtistID() {
		return artistID;
	}








	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}








	public int getAlbumID2() {
		return albumID2;
	}








	public void setAlbumID2(int albumID2) {
		this.albumID2 = albumID2;
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








	public int getArtistID2() {
		return artistID2;
	}








	public void setArtistID2(int artistID2) {
		this.artistID2 = artistID2;
	}




	 
 

	
	
	


	@Override
    public String toString() {
        return "songID [ songID=" + songID + ", genre is ="
                + genre + ", streams= " + streams +" ]" + " song name is = " + song_name + "bpm = " + BPM + "."
                +"albumID [ albumID=" + albumID + "artistID  artistID= " + artistID + "album table id:" + albumID2
                +  ", album name is ="
                        + album_name + ", total streams=" + total_streams +"]" + "has rating = " + rating + "length = " + length + ".";
    }
}
