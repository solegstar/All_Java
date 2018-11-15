package exempledDiploma.facades;

import exempledDiploma.dao.TourDao;
import exempledDiploma.dao.impl.DefaultTourDao;
import exempledDiploma.models.Tour;
import exempledDiploma.models.User;

public class TourFacade {

	private TourDao tourDao;
	
	{
		tourDao = new DefaultTourDao();
	}
	
	public Tour getTourById (int id) {
		if (id > 0) {
			return tourDao.getTourById(id);
		}
		throw new IllegalArgumentException();
	}
	
	public boolean saveTour (Tour tour) {
		return tourDao.saveTour(tour);
	}
	
	public boolean updateTour (Tour tour) {
		return tourDao.updateTour(tour);
	}

	public boolean deleteTour (Tour tour) {
		return tourDao.deleteTour(tour);
	}
}
