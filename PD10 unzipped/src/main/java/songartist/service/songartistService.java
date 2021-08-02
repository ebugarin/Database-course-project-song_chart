package songartist.service;

import java.util.List;

import songartist.domain.songartist;
import user.dao.UserDao;
import songartist.dao.songartistDao;

import user.domain.User;

/**
 * logic functions such as register, login
 * @author changxin bai
 *
 */
public class songartistService {
	private songartistDao songartistDao = new songartistDao();
	
	/**
	 * register a user
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	
	public List<Object> complex4() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songartistDao.complex4();
		
	}
	
	public List<Object> complex5() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songartistDao.complex5();
		
	}
	
	public List<Object> complex6() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songartistDao.complex6();
		
	}
	public List<Object> complex7() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songartistDao.complex7();
		
	}
	public List<Object> complex8() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return songartistDao.complex8();
		
	}
}
