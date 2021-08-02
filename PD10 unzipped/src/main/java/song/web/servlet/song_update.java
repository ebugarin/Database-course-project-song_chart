package song.web.servlet;

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

import song.service.songException;
import song.service.songService;
import song.domain.song;
import song.dao.songDao;
import user.domain.User;
import user.service.UserException;
import user.service.UserService;

/**
 * Servlet implementation class UserServlet
 */

public class song_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public song_update() {
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
		songService songservice = new songService();
		Map<String,String[]> paramMap = request.getParameterMap();
		song form = new song();
		List<String> info = new ArrayList<String>();
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
		}

		

    	form.setGenre(info.get(1));
    	
		int num2 = Integer.parseInt(info.get(2));
		form.setStreams(num2);
		
		form.setSong_name(info.get(3));
		
		int num3 = Integer.parseInt(info.get(4));
		form.setBPM(num3);
		
		int num = Integer.parseInt(info.get(5));
		form.setAlbumID(num);
		
		int num4 = Integer.parseInt(info.get(6));
		form.setArtistID(num4);
		
		int num1 = Integer.parseInt(info.get(7));
		form.setSongID(num1);
		
		try {
			songservice.update(form);
			
			response.sendRedirect( request.getContextPath() + "/jsps/song/update.jsp");
		} catch (ClassNotFoundException | songException e) {
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
