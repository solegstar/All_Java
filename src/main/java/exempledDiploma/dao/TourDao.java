package exempledDiploma.dao;

import java.util.List;

import exempledDiploma.models.Tour;

public interface TourDao {
	Tour getTourById(int id);
	List <Tour> getAllTours();
}
