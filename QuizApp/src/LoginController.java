

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logincontroller")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg="";
		String userid= request.getParameter("uid");
		String password= request.getParameter("pass");
		if(userid.equals(password))
		{
			msg="matched..!";
			System.out.println("yesss");
			response.sendRedirect("welcome.jsp");
		}
		else
			msg="invalid";
	}

}
