package exempledDiploma.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import exempledDiploma.facades.TourFacade;
import exempledDiploma.facades.UserFacade;
import exempledDiploma.models.Tour;
import exempledDiploma.models.User;

@WebServlet("/updateTour")
public class UpdateTour extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TourFacade tourFacade;
	{
		tourFacade = new TourFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Tour tour = tourFacade.getTourById(Integer.valueOf(request.getParameter("tourId")));
		session.setAttribute("currentTour", tour);
		System.out.println(tour);
		request.setAttribute("tour", tour); // set attribute for .jsp
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/updateTour.jsp");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - Update Tour");
		
		String tourId = request.getParameter("tour_id");
		String nameTour = request.getParameter("nametour");
		String priceTour = request.getParameter("pricetour");
		String dateTourBegin = request.getParameter("datetourbegin");
		String dateTourEnd = request.getParameter("datetourend");
		String flyTime = request.getParameter("flytime");

		Tour tour = new Tour();
		tour.setId(Integer.valueOf(tourId));
		tour.setNameTour(nameTour);
		tour.setPriceTour(priceTour);
		tour.setDateTourBegin(dateTourBegin);
		tour.setDateTourEnd(dateTourEnd);
		tour.setFlytime(flyTime);

		if (tourFacade.saveTour(tour)) {
			request.setAttribute("tour", tour);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/successTourUpdate.jsp");
			rd.forward(request, response);
		}
	}
}