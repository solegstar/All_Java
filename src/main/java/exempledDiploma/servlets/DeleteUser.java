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

@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserFacade userFacade;
	{
		userFacade = new UserFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/deleteUser.jsp");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - Delete User");

		String userId = request.getParameter("user_id");

		User user = new User();
		user.setId(Integer.valueOf(userId));

		if (userFacade.deleteUser(user)) {
			request.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/successDelete.jsp");
			rd.forward(request, response);
		}

	}

}