package artist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import java.util.ArrayList;
import java.util.List;

import user.domain.User;
import java.sql.Statement;

public class initDao {

	public void initDB()  {
		Statement statement;
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://141.217.48.128:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		    //
			statement = connect.createStatement();
			statement.executeUpdate("DROP TABLE IF EXISTS song_chart");
			
			String sqlstmt = "CREATE TABLE IF NOT EXISTS artist"
					+ "( artistID INTEGER AUTO_INCREMENT,"
					+ "nationality VARCHAR(30),"
					+"total_albums SMALLINT,"
					+"awards SMALLINT,"
					+"artist_name VARCHAR(30),"
					+"PRIMARY KEY (artistID) )";
			
			statement.executeUpdate(sqlstmt);
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

	
	
