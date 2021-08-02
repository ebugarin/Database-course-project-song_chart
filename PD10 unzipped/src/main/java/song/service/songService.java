package song.service;

import java.util.List;

import song.domain.song;
import user.dao.UserDao;
import song.dao.songDao;

import user.domain.User;

/**
 * logic functions such as register, login
 * @author changxin bai
 *
 */
public class songService {
	private songDao songDao = new songDao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void insert(song form) throws songException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		songDao.add(form);
	}
	public void update(song form) throws songException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
//		// check the user name
//		artist user = artistDao.findByName(form.getUsername());
//		if(artist.getArtist_name()!=null && artist.getArtist_name().equals(form.getUsername())) throw new UserException("This user name has been registered!");
		songDao.update(form);
	}	
	
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws songException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void read(song form) throws songException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		songDao.read(form);

		
	}

	public void delete(song form) throws songException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		songDao.delete(form);

		
	}
	public List<Object> findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songDao.findall();
		
	}
	///
	
	public List<Object> complex() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songDao.complex();
		
	}
	public List<Object> complex2() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songDao.complex2();
		
	}
	public List<Object> complex3() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songDao.complex3();
		
	}
}
