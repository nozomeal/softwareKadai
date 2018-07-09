

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Absence
 */
@WebServlet(name = "Absence",
urlPatterns = {"/Absence"})//出席

public class Absence extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Absence() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  //jspに遷移
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		  throws ServletException, IOException {
    			    RequestDispatcher dispatcher = request.getRequestDispatcher(
    			        "/WEB-INF/jsp/Absence.jsp");
    			    dispatcher.forward(request, response);
    			   /* response.setContentType("text/plain");
    			    response.setCharacterEncoding("UTF-8");*/

    	  //  response.getWriter().print("Hello App Engine!\r\n");

    	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
