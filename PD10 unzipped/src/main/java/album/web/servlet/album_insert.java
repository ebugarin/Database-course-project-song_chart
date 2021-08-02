package album.web.servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import album.domain.album;
import album.service.albumException;
import album.service.albumService;
import user.dao.UserDao;
import user.domain.User;
import user.service.UserException;
import user.service.UserService;

/**
 * Servlet implementation class UserServlet
 */

public class album_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public album_insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Map<String, String> form = new HashMap<String,String>();
		albumService albumservice = new albumService();
		Map<String,String[]> paramMap = request.getParameterMap();
		album form = new album();
		List<String> info = new ArrayList<String>();
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
		}
		//form.setNationality(info.get(1));
		//form.setArtist_name(info.get(2));
		
//		int num = Integer.parseInt(info.get(1));
//		form.setAlbumID(num);
		

		int num2 = Integer.parseInt(info.get(1));
		form.setTotal_streams(num2);
		
		form.setAlbum_name(info.get(2));
		
		int num3 = Integer.parseInt(info.get(3));
		form.setRating(num3);
		
		LocalTime i = LocalTime.parse(info.get(4));
		form.setLength(i);
		
		int num4 = Integer.parseInt(info.get(5));
		form.setArtistID(num4);
		
		try {
			albumservice.insert(form);
			
			response.sendRedirect( request.getContextPath() + "/jsps/album/insert.jsp");
		} catch (ClassNotFoundException | albumException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	}
