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

@WebServlet("/updateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int userIdTmp;
	private String nameTmp;
	private String lastNameTmp;
	private String dobTmp;
	private String emailTmp;

	private UserFacade userFacade;
	{
		userFacade = new UserFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = userFacade.getUserById(Integer.valueOf(request.getParameter("userId")));
		userIdTmp = user.getId();
		nameTmp = user.getName();
		lastNameTmp = user.getLastName();
		dobTmp = user.getDob();
		emailTmp = user.getEmail();
		System.out.println(user);
		request.setAttribute("user", user); // set attribute for .jsp
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/updateUser.jsp");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - Update User");

		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		String lastName = request.getParameter("last_name");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");

		User user = new User();
		user.setId(userIdTmp);
		
//		if (name != null) { // empty box check condition!!!!????
//			System.out.println("not null");
				user.setName(name);
//		} else
//			System.out.println("null check Name:" + nameTmp);
//			user.setName(nameTmp);

		user.setLastName(lastName);
		user.setDob(dob);
		user.setEmail(email);

		if (userFacade.updateUser(user)) {
			request.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/successUpdate.jsp");
			rd.forward(request, response);
		}

	}

}