package song.domain;

import java.time.LocalTime;

/**
 * artist object
 * 
 * @author eric bugarin
 * 
 */
public class song {

	
	private int songID;
	 private String genre;
	 private int  streams;
	 private String song_name;
	 private int   BPM;
	 private int  albumID;
	 private int  artistID;
	 
	 
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



	
	
	


	@Override
    public String toString() {
        return "songID [ songID=" + songID + ", genre is ="
                + genre + ", streams= " + streams +" ]" + " song name is = " + song_name + "bpm = " + BPM + "."
                +"albumID [ albumID=" + albumID + "artistID [ artistID=" + artistID;
    }
}
