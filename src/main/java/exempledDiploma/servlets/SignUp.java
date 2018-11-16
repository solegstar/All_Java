package exempledDiploma.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exempledDiploma.facades.UserFacade;
import exempledDiploma.models.User;

@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserFacade userFacade;
	{
		userFacade = new UserFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/signup.jsp");
		rs.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - SignUp");

		String name = request.getParameter("name");
		String lastName = request.getParameter("last_name");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String confPass = request.getParameter("confPass");

		User user = new User();
		user.setName(name);
		user.setLastName(lastName);
		user.setDob(dob);
		user.setEmail(email);
		user.setPass(pass);
		System.out.println("ConfPass: " + confPass);

		if (userFacade.saveUser(user)) {
			request.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/success.jsp");
			rd.forward(request, response);
		}
	}
}