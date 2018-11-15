package exempledDiploma.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exempledDiploma.facades.TourFacade;
import exempledDiploma.models.Tour;

@WebServlet("/createTour")
public class CreateTour extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TourFacade tourFacade;
	{
		tourFacade = new TourFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/createTour.jsp");
		rs.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - Create Tour");

		String nameTour = request.getParameter("nametour");
		String priceTour = request.getParameter("pricetour");
		String dateTourBegin = request.getParameter("datetourbegin");
		String dateTourEnd = request.getParameter("datetourend");
		String flyTime = request.getParameter("flytime");

		Tour tour = new Tour();
		tour.setNameTour(nameTour);
		tour.setPriceTour(priceTour);
		tour.setDateTourBegin(dateTourBegin);
		tour.setDateTourEnd(dateTourEnd);
		tour.setFlytime(flyTime);

		if (tourFacade.saveTour(tour)) {
			request.setAttribute("tour", tour);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/successTourCreate.jsp");
			rd.forward(request, response);
		}
	}
}