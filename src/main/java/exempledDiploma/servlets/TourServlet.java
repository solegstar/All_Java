package exempledDiploma.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exempledDiploma.facades.TourFacade;
import exempledDiploma.models.Tour;


@WebServlet("/TourServlet")
public class TourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TourFacade tourFacade;
	
	{ tourFacade = new TourFacade();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tour tour = tourFacade.getTourById(Integer.valueOf(request.getParameter("tourId")));
		System.out.println(tour);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
