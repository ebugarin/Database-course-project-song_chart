package artist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import artist.domain.artist;
import artist.domain.artist;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * DDL functions performed in database
 * @author changxin bai
 *
 */
public class artistDao {
	
	
	/**
	 * get the search result with username 
	 * @param username
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(artist artist) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from artist where artistID = (?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    //preparestatement.setInt(1,artist.getArtistID());
		    preparestatement.setString(1,artist.getArtistID()+"");


		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
//		    	String user_name = resultSet.getString("username");
//		    	if(user_name.equals(username)){
		    	artist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	artist.setNationality(resultSet.getString("nationality"));
		    	artist.setNum_albums(Integer.parseInt(resultSet.getString("num_albums")));
		    	artist.setNum_awards(Integer.parseInt(resultSet.getString("num_awards")));
		    	artist.setArtist_name(resultSet.getString("artist_name"));
	
		    	//}
		    }
		    System.out.println(artist);
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
	public void add(artist artist) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "insert into artist (nationality ,num_albums,num_awards,artist_name) VALUES (?, 0, 0, ?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,artist.getNationality());
		    preparestatement.setString(2,artist.getArtist_name());


		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// update
	public void update(artist artist) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			

			String sql = "update artist set nationality = (?), artist_name = (?), num_albums = (?), num_awards = (?) where artistID =(?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,artist.getNationality());
		    preparestatement.setString(2,artist.getArtist_name());
		    //preparestatement.setInt(3,artist.getArtistID());
		    preparestatement.setInt(3,artist.getNum_albums());
		    preparestatement.setInt(4,artist.getNum_awards());
		    preparestatement.setInt(5,artist.getArtistID());

//
		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// delete
	public void delete(artist artist) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		
			
			String sql = "delete from artist where artistID = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 

			preparestatement.setInt(1,artist.getArtistID());

			read(artist);
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
			
			
			String sql = "select * from artist";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				artist artist = new artist();
				artist.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	artist.setNationality(resultSet.getString("nationality"));
		    	artist.setNum_albums(Integer.parseInt(resultSet.getString("num_albums")));
		    	artist.setNum_awards(Integer.parseInt(resultSet.getString("num_awards")));
		    	artist.setArtist_name(resultSet.getString("artist_name"));
	    		list.add(artist);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
		
}
