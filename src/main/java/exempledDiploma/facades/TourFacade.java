package exempledDiploma.facades;

import exempledDiploma.dao.TourDao;
import exempledDiploma.dao.impl.DefaultTourDao;
import exempledDiploma.models.Tour;

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
}
