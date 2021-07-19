package artist.service;

import java.util.List;

import artist.domain.artist;
import user.dao.UserDao;
import artist.dao.artistDao;

import user.domain.User;
import artist.domain.artist;

/**
 * logic functions such as register, login
 * @author changxin bai
 *
 */
public class artistService {
	private artistDao artistDao = new artistDao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void insert(artist form) throws UserException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		artistDao.add(form);
	}
	
	
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(artist form) throws UserException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		artist artist = artistDao.findByName(form.getArtist_name());
		if(artist.getArtist_name()==null) throw new UserException("The user is not in the database");
		
		
	}
	
//	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
//		return userDao.findall();
//		
//	}
}
