package songartist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import songartist.domain.songartist;
import user.domain.User;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * DDL functions performed in database
 * @author changxin bai
 *
 */
public class songartistDao {
	
	
	/**
	 * get the search result with username 
	 * @param username
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	
	
	public List<Object> complex4() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where rating > 75 and BPM <100";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				songartist songartist = new songartist();
				songartist.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	songartist.setGenre(resultSet.getString("genre"));
		    	songartist.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	songartist.setSong_name(resultSet.getString("song_name"));
		    	songartist.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	songartist.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	
		    	songartist.setAlbumID2(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	songartist.setAlbum_name(resultSet.getString("album_name"));
		    	songartist.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	songartist.setLength(LocalTime.parse(resultSet.getString("length")));
		    	songartist.setArtistID2(Integer.parseInt(resultSet.getString("ArtistID")));
		    	
	    		list.add(songartist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> complex5() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where rating = 84 and BPM = 152";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				songartist songartist = new songartist();
				songartist.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	songartist.setGenre(resultSet.getString("genre"));
		    	songartist.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	songartist.setSong_name(resultSet.getString("song_name"));
		    	songartist.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	songartist.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	
		    	songartist.setAlbumID2(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	songartist.setAlbum_name(resultSet.getString("album_name"));
		    	songartist.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	songartist.setLength(LocalTime.parse(resultSet.getString("length")));
		    	songartist.setArtistID2(Integer.parseInt(resultSet.getString("ArtistID")));
		    	
	    		list.add(songartist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> complex6() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where BPM between 80 and 190 and rating between 79 and 100";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				songartist songartist = new songartist();
				songartist.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	songartist.setGenre(resultSet.getString("genre"));
		    	songartist.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	songartist.setSong_name(resultSet.getString("song_name"));
		    	songartist.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	songartist.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	
		    	songartist.setAlbumID2(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	songartist.setAlbum_name(resultSet.getString("album_name"));
		    	songartist.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	songartist.setLength(LocalTime.parse(resultSet.getString("length")));
		    	songartist.setArtistID2(Integer.parseInt(resultSet.getString("ArtistID")));
		    	
	    		list.add(songartist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> complex7() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where genre = 'psychodelic' and length between '00:40:00' and '00:52:00' ORDER by BPM";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				songartist songartist = new songartist();
				songartist.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	songartist.setGenre(resultSet.getString("genre"));
		    	songartist.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	songartist.setSong_name(resultSet.getString("song_name"));
		    	songartist.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	songartist.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	
		    	songartist.setAlbumID2(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	songartist.setAlbum_name(resultSet.getString("album_name"));
		    	songartist.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	songartist.setLength(LocalTime.parse(resultSet.getString("length")));
		    	songartist.setArtistID2(Integer.parseInt(resultSet.getString("ArtistID")));
		    	
	    		list.add(songartist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> complex8() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where genre = 'pop' or genre = 'rap' and rating >= 80 and length > '00:40:00' order by BPM";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				songartist songartist = new songartist();
				songartist.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	songartist.setGenre(resultSet.getString("genre"));
		    	songartist.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	songartist.setSong_name(resultSet.getString("song_name"));
		    	songartist.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	songartist.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	
		    	songartist.setAlbumID2(Integer.parseInt(resultSet.getString("albumID")));
		    	songartist.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	songartist.setAlbum_name(resultSet.getString("album_name"));
		    	songartist.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	songartist.setLength(LocalTime.parse(resultSet.getString("length")));
		    	songartist.setArtistID2(Integer.parseInt(resultSet.getString("ArtistID")));
		    	
	    		list.add(songartist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
}
