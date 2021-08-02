package album.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import album.domain.album;
import song.domain.song;
import user.domain.User;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * DDL functions performed in database
 * @author changxin bai
 *
 */
public class albumDao {
	
	
	/**
	 * get the search result with username 
	 * @param username
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(album album) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from album where albumID = (?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    //preparestatement.setInt(1,artist.getArtistID());
		    preparestatement.setString(1,album.getAlbumID()+"");


		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
//		    	String user_name = resultSet.getString("username");
//		    	if(user_name.equals(username)){
		    	album.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	album.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	album.setAlbum_name(resultSet.getString("album_name"));
		    	album.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	album.setLength(LocalTime.parse(resultSet.getString("length")));
		    	album.setArtistID(Integer.parseInt(resultSet.getString("ArtistID")));
		    	//}
		    }
		    System.out.println(album);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	
	/**
	 * insert User
	 * @param user
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void add(album album) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "insert into album (total_streams, album_name, rating, length, artistID) VALUES (?, ?, ?, ?, ?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql);
			
			
			
		    preparestatement.setInt(1,album.getTotal_streams());
		    preparestatement.setString(2,album.getAlbum_name());
		    preparestatement.setInt(3,album.getRating());
		    preparestatement.setObject(4,album.getLength());
		    preparestatement.setInt(5,album.getArtistID());
			

			


		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// update
	public void update(album album) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			

			String sql = "update album set total_streams = (?), album_name = (?), rating = (?), length = (?), artistID = (?) where albumID =(?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
		    preparestatement.setInt(1,album.getTotal_streams());
		    preparestatement.setString(2,album.getAlbum_name());
		    preparestatement.setInt(3,album.getRating());
		    preparestatement.setObject(4,album.getLength());
		    preparestatement.setInt(5,album.getArtistID());

		    
			preparestatement.setInt(6,album.getAlbumID());

		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// delete
	public void delete(album album) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		
			
			String sql = "delete from album where albumID = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 

			preparestatement.setInt(1,album.getAlbumID());

			read(album);
			preparestatement.executeUpdate();
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from album";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				album album = new album();
				album.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	album.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	album.setAlbum_name(resultSet.getString("album_name"));
		    	album.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	album.setLength(LocalTime.parse(resultSet.getString("length")));	
		    	album.setArtistID(Integer.parseInt(resultSet.getString("ArtistID")));

	    		list.add(album);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	///////
	
	public List<Object> complex() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from album s where  rating >  (SELECT AVG(rating) FROM album WHERE length < '00:59:00')";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				album album = new album();
				album.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	album.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	album.setAlbum_name(resultSet.getString("album_name"));
		    	album.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	album.setLength(LocalTime.parse(resultSet.getString("length")));
		    	album.setArtistID(Integer.parseInt(resultSet.getString("ArtistID")));
	    		list.add(album);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	public List<Object> complex2() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from album s where  rating >  (SELECT AVG(rating) FROM album WHERE length < '00:59:00')";

			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				album album = new album();
				album.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	album.setTotal_streams(Integer.parseInt(resultSet.getString("total_streams")));
		    	album.setAlbum_name(resultSet.getString("album_name"));
		    	album.setRating(Integer.parseInt(resultSet.getString("rating")));
		    	album.setLength(LocalTime.parse(resultSet.getString("length")));
		    	album.setArtistID(Integer.parseInt(resultSet.getString("ArtistID")));
	    		list.add(album);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
}
