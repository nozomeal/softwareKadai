

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }
  //追加
	//List<String> list = new ArrayList<String>();//リストで管理
	String number ="";
	String name = "";
    //追加
    ListModel model = new ListModel(number,name);
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		  throws ServletException, IOException {
    	
        name=model.getName();
        number=model.getNumber();
        System.out.println("doGet");
        System.out.print("number:"+number+"　/");
	    System.out.println("name:"+name);
    	
    		 getServletConfig().getServletContext().
    	      getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
    	
    	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//追加
    	String number="";
    	String name="";
    	
    	try {
    		number = request.getParameter("number"); 
    		name = request.getParameter("name"); 
    	}catch(NumberFormatException e) {
    	     
        }
    	request.setAttribute("number", number);
        request.setAttribute("name", name);
        model.setName(name);
        model.setNumber(number);
        System.out.println("doPost");
        System.out.print("number:"+number+"　/");
	     System.out.println("name:"+name);
    	if(number!=null&&name!=null) {
    		 getServletConfig().getServletContext().
    	      getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
    	}
    	 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Absence.jsp");
		    dispatcher.forward(request, response);
		//doGet(request, response);
	}

}
