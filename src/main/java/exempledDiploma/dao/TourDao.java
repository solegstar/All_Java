package exempledDiploma.dao;

import java.util.List;

import exempledDiploma.models.Tour;
import exempledDiploma.models.User;

public interface TourDao {
	Tour getTourById(int id);
	List <Tour> getAllTours();
	boolean saveTour(Tour tour);
	boolean updateTour(Tour tour);
	boolean deleteTour(Tour tour);
}
