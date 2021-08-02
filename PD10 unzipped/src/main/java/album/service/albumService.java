package album.service;

import java.util.List;

import album.domain.album;
import user.dao.UserDao;
import album.dao.albumDao;

import user.domain.User;

/**
 * logic functions such as register, login
 * @author changxin bai
 *
 */
public class albumService {
	private albumDao albumDao = new albumDao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void insert(album form) throws albumException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		albumDao.add(form);
	}
	public void update(album form) throws albumException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		albumDao.update(form);
	}	
	
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws albumException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(album form) throws albumException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		albumDao.read(form);

		
	}

	public void delete(album form) throws albumException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		albumDao.delete(form);

		
	}
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return albumDao.findall();
		
	}
	
	public List<Object> complex() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return albumDao.complex();
		
	}
	
	public List<Object> complex2() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return albumDao.complex2();
		
	}

}
