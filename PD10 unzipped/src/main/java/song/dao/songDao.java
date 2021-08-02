package song.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
public class songDao {
	
	
	/**
	 * get the search result with username 
	 * @param username
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(song song) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from song where songID = (?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    //preparestatement.setInt(1,artist.getArtistID());
		    preparestatement.setString(1,song.getSongID()+"");


		    ResultSet resultSet = preparestatement.executeQuery();
		    //ResultSet resultSet  = preparestatement.executeUpdate();
		    while(resultSet.next()){
//		    	String user_name = resultSet.getString("username");
//		    	if(user_name.equals(username)){
		    	song.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	song.setGenre(resultSet.getString("genre"));
		    	song.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	song.setSong_name(resultSet.getString("song_name"));
		    	song.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	song.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	song.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
		    	//}
		    }
		    System.out.println(song);
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
	public void add(song song) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "insert into song (genre, streams, song_name, BPM, albumID, artistID) VALUES (?, ?, ?, ?, ?,?)";
					
			PreparedStatement preparestatement = connect.prepareStatement(sql);
		
			
		    //preparestatement.setInt(1,song.getSongID());
		    preparestatement.setString(1,song.getGenre());
		    preparestatement.setInt(2,song.getStreams());
		    preparestatement.setString(3,song.getSong_name());
		    preparestatement.setInt(4,song.getBPM());
		    preparestatement.setInt(5,song.getAlbumID());
		    preparestatement.setInt(6,song.getArtistID());
			

			


		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// update
	public void update(song song) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			

			String sql = "update song set genre = ?, streams =?, song_name=?, BPM=?, albumID=?, artistID=? where songID = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			
			 //preparestatement.setInt(1,song.getSongID());
		    preparestatement.setString(1,song.getGenre());
		    preparestatement.setInt(2,song.getStreams());
		    preparestatement.setString(3,song.getSong_name());
		    preparestatement.setInt(4,song.getBPM());
		    preparestatement.setInt(5,song.getAlbumID());
		    preparestatement.setInt(6,song.getArtistID());
		    preparestatement.setInt(7,song.getSongID());
		    

		    preparestatement.executeUpdate();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// delete
	public void delete(song song) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		
			
			String sql = "delete from song where songID = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 

			preparestatement.setInt(1,song.getSongID());

			read(song);
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
			
			
			String sql = "select * from song";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				song song = new song();
				song.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	song.setGenre(resultSet.getString("genre"));
		    	song.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	song.setSong_name(resultSet.getString("song_name"));
		    	song.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	song.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	song.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
	    		list.add(song);
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
			
			
			String sql = "select * from song s where  exists (SELECT * FROM song WHERE songID = s.songID AND streams > 1000000 AND genre = 'pop')";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				song song = new song();
				song.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	song.setGenre(resultSet.getString("genre"));
		    	song.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	song.setSong_name(resultSet.getString("song_name"));
		    	song.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	song.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	song.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
	    		list.add(song);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
///////
	
	public List<Object> complex2() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select songID, genre, streams, song_name, BPM from song s where  streams < (SELECT AVG(streams) FROM song WHERE albumID = s.albumID)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				song song = new song();
				song.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	song.setGenre(resultSet.getString("genre"));
		    	song.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	song.setSong_name(resultSet.getString("song_name"));
		    	song.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	//song.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	//song.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
	    		list.add(song);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
///////
	
	public List<Object> complex3() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
			
			
			String sql = "select * from song s where  BPM < (SELECT AVG(BPM) FROM song WHERE albumID = s.albumID)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();
			
			while(resultSet.next()){
				song song = new song();
				song.setSongID(Integer.parseInt(resultSet.getString("songID")));
		    	song.setGenre(resultSet.getString("genre"));
		    	song.setStreams(Integer.parseInt(resultSet.getString("streams")));
		    	song.setSong_name(resultSet.getString("song_name"));
		    	song.setBPM(Integer.parseInt(resultSet.getString("BPM")));
		    	song.setAlbumID(Integer.parseInt(resultSet.getString("albumID")));
		    	song.setArtistID(Integer.parseInt(resultSet.getString("artistID")));
	    		list.add(song);
			 }
			 
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
	
	
}
