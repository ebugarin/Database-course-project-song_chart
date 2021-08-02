package user.dao;

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
			          .getConnection("jdbc:mysql://localhost:3306/song_chart?"
				              + "user=root&password=3l0nMuk!");
		    //
			statement = connect.createStatement();
			statement.executeUpdate("DROP TABLE IF EXISTS top_chart");
			statement.executeUpdate("DROP TABLE IF EXISTS song");
			statement.executeUpdate("DROP TABLE IF EXISTS album");
			statement.executeUpdate("DROP TABLE IF EXISTS artist");
			
			String sqlstmt = "CREATE TABLE IF NOT EXISTS artist"
					+ "( artistID INTEGER AUTO_INCREMENT,"
					+ "nationality VARCHAR(30),"
					+"num_albums SMALLINT,"
					+"num_awards SMALLINT,"
					+"artist_name VARCHAR(30) NOT NULL,"
					+"PRIMARY KEY (artistID) )";
			
			statement.executeUpdate(sqlstmt);
			
			
			statement.executeUpdate("DROP TABLE IF EXISTS album");
			
			String sqlstmt2 = "CREATE TABLE IF NOT EXISTS album "
					+ "  ( albumID        INTEGER AUTO_INCREMENT,"
					+ "   total_streams       BIGINT,"
					+ "   album_name      VARCHAR(30) NOT NULL,"
					+ "   rating        SMALLINT,"
					+ "   length TIME NOT NULL,"
					+ "   artistID        INTEGER NOT NULL,"
					+ "   PRIMARY KEY (albumID),"
					+ "   FOREIGN KEY (artistID) REFERENCES artist(artistID))";
					
			
			statement.executeUpdate(sqlstmt2);
			

			statement.executeUpdate("DROP TABLE IF EXISTS song");
			
			String sqlstmt3 = "CREATE TABLE IF NOT EXISTS song"
					+ "  ( songID        INTEGER AUTO_INCREMENT,"
					+ "   genre      VARCHAR(30),"
					+ "   streams        BIGINT,"
					+ "   song_name        VARCHAR(30) NOT NULL,"
					+ "   BPM        SMALLINT,"
					+ "   albumID        INTEGER,"
					+ "   artistID        INTEGER NOT NULL,"
					+ "   PRIMARY KEY (songID),"
					+ "   FOREIGN KEY (albumID) REFERENCES album(albumID),"
					+ "   FOREIGN KEY (artistID) REFERENCES artist(artistID))";
					
			
			statement.executeUpdate(sqlstmt3);
			
			//////
			String sqlstmt5 = "INSERT INTO artist VALUES "
					+ " (1, 'australian', 4, 16, 'tame impala'),"
					+ " (2, 'canadian', 5, 59, 'the weeknd'),"
					+ " (3, 'american', 3, 0, 'travis scott')";
					
					
			
			statement.executeUpdate(sqlstmt5);
			
			
			String sqlstmt6 = "INSERT INTO album VALUES "
					+ " (1, 1600000000, 'currents', 84, '00:51:12', 1),"
					+ " (2, 1670000000, 'after hours', 80, '00:56:19', 2),"
					+ " (3, 2100000000, 'astroworld', 85, '00:58:33', 3),"
					+ " (4, 80145, 'kissland', 72, '00:56:19', 2)";
					
					
			
			statement.executeUpdate(sqlstmt6);
			
			
			
			String sqlstmt7 =
			" INSERT INTO song VALUES"
			+"(1, 'psychodelic', 829000000, 'the less i know the better', 117, 1,1),"
			+"(2, 'psychodelic', 144000000, 'new person, same old mistakes', 152, 1,1),"
			+" (3, 'psychodelic', 265000000, 'let it happen', 123, 1,1),"
			+"(4, 'pop', 1600000000 , 'blinding lights', 86, 2,2),"
			+"(5, 'pop', 600000000 , 'save your tears', 118, 2,2),"
			+"(6, 'rap', 1500000000 , 'sicko mode', 78, 3,3)";

					
			
			statement.executeUpdate(sqlstmt7);
			
			//
			
			String sqlstmt4 = "CREATE TABLE IF NOT EXISTS top_chart"
					+ "  ( week_of        DATE,"
					+ "   weeks_charted      INTEGER,"
					+ "   songID INTEGER,\r\n"
					+ "   artistID      INTEGER,"
					+ "   albumID      INTEGER,"
					+ "   PRIMARY KEY (week_of),"
					+ "   FOREIGN KEY (albumID) REFERENCES album(albumID),"
					+ "   FOREIGN KEY (artistID) REFERENCES artist(artistID),"
					+ "   FOREIGN KEY (songID) REFERENCES song(songID))";
					
					
			
			statement.executeUpdate(sqlstmt4);
			
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

	
	
