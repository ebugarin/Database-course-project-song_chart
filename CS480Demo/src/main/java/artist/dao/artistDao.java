package artist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import artist.domain.artist;
import user.domain.User;
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
	public artist findByName(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		artist artist = new artist();
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		    String sql = "select * from tb_user where username=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,username);
		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
		    	String user_name = resultSet.getString("username");
		    	if(user_name.equals(username)){
		    		artist.setNationality(resultSet.getString("password"));
		    		artist.setArtist_name(resultSet.getString("username"));
		    		
		    		
		    	}
		    }
		
		    
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return artist;
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
			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "insert into tb_user values(nationality, name,id,num album, num award)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,artist.getNationality());
		    preparestatement.setString(2,artist.getArtist_name());
		    preparestatement.setLong(3,artist.getArtistID());
		    preparestatement.setLong(4,artist.getNum_albums());
		    preparestatement.setLong(5,artist.getNum_awards());

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
			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
//			InputStreamReader isr = new InputStreamReader(System.in);
//			BufferedReader br = new BufferedReader(isr);
//			
			String sql = "update artist values(?,?,?)";
//			String str = br.readLine();
//
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,artist.setNationality());
//		    preparestatement.setString(2,artist.setArtist_name());
//		    preparestatement.setLong(3,artist.getArtistID());
//		    preparestatement.setLong(4,artist.getNum_albums());
//		    preparestatement.setLong(5,artist.getNum_awards());
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
			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
//			
//			
//			String sql = "delete from artist: ?";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,artist.setNationality("NULL"));
//		    preparestatement.setString(2,artist.getArtist_name());
//		    preparestatement.setLong(3,artist.getArtistID());
//		    preparestatement.setLong(4,artist.getNum_albums());
//		    preparestatement.setLong(5,artist.getNum_awards());
//
//		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
//	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
//		List<Object> list = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection connect = DriverManager
//			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
//				              + "user=root&password=3l0nMuk!");
//			
//			
//			String sql = "select * from tb_user";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//			ResultSet resultSet = preparestatement.executeQuery();
//			
//			while(resultSet.next()){
//				User user = new User();
//				user.setUsername(resultSet.getString("username"));
//	    		user.setPassword(resultSet.getString("password"));
//	    		user.setEmail(resultSet.getString("email"));
//	    		list.add(user);
//			 }
//			 
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
//		return list;
//		
//	}
		
}
