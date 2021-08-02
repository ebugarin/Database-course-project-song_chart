package artist.web.servlet;

import java.io.IOException;
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

import artist.domain.artist;
import user.dao.UserDao;
import user.domain.User;
import user.service.UserException;
import user.service.UserService;
import artist.service.artistException;
import artist.service.artistService;
/**
 * Servlet implementation class UserServlet
 */

public class artist_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public artist_update() {
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
		artistService artistservice = new artistService();
		Map<String,String[]> paramMap = request.getParameterMap();
		artist form = new artist();
		List<String> info = new ArrayList<String>();
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
		}
		form.setNationality(info.get(1));
		form.setArtist_name(info.get(2));
		
		int num = Integer.parseInt(info.get(3));
		form.setArtistID(num);
		

		int num3 = Integer.parseInt(info.get(4));
		form.setNum_albums(num3);
		int num4 = Integer.parseInt(info.get(5));
		form.setNum_awards(num4);

		
		try {
			artistservice.update(form);
			
			response.sendRedirect( request.getContextPath() + "/jsps/artist/update.jsp");
		} catch (ClassNotFoundException | artistException e) {
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
