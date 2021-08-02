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
	public void insert(artist form) throws artistException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		artistDao.add(form);
	}
	public void update(artist form) throws artistException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		artistDao.update(form);
	}	
	
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws artistException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(artist form) throws artistException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		artistDao.read(form);

		
	}

	public void delete(artist form) throws artistException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		artistDao.delete(form);

		
	}
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return artistDao.findall();
		
	}
}
