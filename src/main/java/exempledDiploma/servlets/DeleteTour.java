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

@WebServlet("/deleteTour")
public class DeleteTour extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TourFacade tourFacade;
	{
		tourFacade = new TourFacade();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/views/deleteTour.jsp");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DO POST - Delete Tour");

		String tourId = request.getParameter("tour_id");

		Tour tour = new Tour();
		tour.setId(Integer.valueOf(tourId));

		if (tourFacade.deleteTour(tour)) {
			request.setAttribute("tour", tour);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/successTourDelete.jsp");
			rd.forward(request, response);
		}

	}

}