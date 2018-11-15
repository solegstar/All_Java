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
import exempledDiploma.models.User;

public class DefaultTourDao implements TourDao {

	public static final String SELECT_TOUR_BY_ID_QUERY = "SELECT * FROM tour WHERE tour.id = ?";
	public static final String INSERT_NEW_TOUR = "INSERT INTO tour (nametour, pricetour, datetourbegin, datetourend, flytime) VALUES (?, ?, ?, ?, ?)";
	public static final String UPDATE_TOUR = "UPDATE tour SET nametour = (?), pricetour = (?), datetourbegin = (?), datetourend = (?), flytime = (?) WHERE (id = (?))";
	public static final String DELETE_TOUR = "DELETE FROM tour WHERE (id = (?));";
	private DataSource ds;

	{
		this.ds = DataSourceUtils.getDataSource();
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
				tour.setPriceTour(rs.getString("pricetour"));
				tour.setDateTourBegin(rs.getString("datetourbegin"));
				tour.setDateTourEnd(rs.getString("datetourend"));
				tour.setFlytime(rs.getString("flytime"));
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

	@Override
	public boolean saveTour(Tour tour) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(INSERT_NEW_TOUR);
			ps.setString(1, tour.getNameTour());
			ps.setString(2, tour.getPriceTour());
			ps.setString(3, tour.getDateTourBegin());
			ps.setString(4, tour.getDateTourEnd());
			ps.setString(5, tour.getFlytime());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateTour(Tour tour) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_TOUR);
			ps.setString(1, tour.getNameTour());
			ps.setString(2, tour.getPriceTour());
			ps.setString(3, tour.getDateTourBegin());
			ps.setString(4, tour.getDateTourEnd());
			ps.setString(5, tour.getFlytime());
			ps.setInt(6, tour.getId());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteTour(Tour tour) {
		try (Connection conn = ds.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(DELETE_TOUR);
			ps.setInt(1, tour.getId());
			// TODO change sql query to insert email and other fields
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
