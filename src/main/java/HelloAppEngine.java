import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	  throws ServletException, IOException {
		    RequestDispatcher dispatcher = request.getRequestDispatcher(
		        "/WEB-INF/jsp/index.jsp");
		    dispatcher.forward(request, response);
		    response.setContentType("text/plain");
		    response.setCharacterEncoding("UTF-8");

  //  response.getWriter().print("Hello App Engine!\r\n");

  }
  @Override 
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    // フォワード
    RequestDispatcher dispatcher = request.getRequestDispatcher("../jsp/index.jsp");
   dispatcher.forward(request, response);
 
  }

  
}