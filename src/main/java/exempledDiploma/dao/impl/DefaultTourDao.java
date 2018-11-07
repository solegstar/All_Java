package exempledDiploma.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import exempledDiploma.dao.TourDao;
import exempledDiploma.dbutils.DataSourceUtils;
import exempledDiploma.models.Tour;

public class DefaultTourDao implements TourDao {

	public static final String SELECT_TOUR_BY_ID_QUERY = "SELECT * FROM tour WHERE tour.id = ?";
	private DataSource ds;

	{
		this.ds = DataSourceUtils.getDataSource();
	}

	public static void main(String[] args) {

	}

	@Override
	public Tour getTourById(int id) {
		Tour tour = new Tour(); // TODO Auto-generated method stub
		try (Connection conn = ds.getConnection()) {
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_TOUR_BY_ID_QUERY);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				tour.setId(rs.getInt("id"));
				tour.setNameTour(rs.getString("nametour"));
				tour.setPriceTour(rs.getDouble("pricetour"));
				tour.setDateTourBegin(rs.getDate("datetourbegin"));
				tour.setDateTourEnd(rs.getDate("datetourend"));
				tour.setFlytime(rs.getTime("flytime"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return tour;
	}

	@Override
	public List<Tour> getAllTours() {
		// TODO Auto-generated method stub
		return null;
	}

}
