package exempledDiploma.models;

import java.sql.Date;
import java.sql.Time;

public class Tour {
	private int id;
	private String nameTour;
	private Double priceTour;
	private Date dateTourBegin;
	private Date dateTourEnd;
	private Time flytime;
	
	@Override
	public String toString() {
		return "Tour [id=" + id + ", nameTour=" + nameTour + ", priceTour=" + priceTour + ", dateTourBegin="
				+ dateTourBegin + ", dateTourEnd=" + dateTourEnd + ", flytime=" + flytime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameTour() {
		return nameTour;
	}

	public void setNameTour(String nameTour) {
		this.nameTour = nameTour;
	}

	public Double getPriceTour() {
		return priceTour;
	}

	public void setPriceTour(Double priceTour) {
		this.priceTour = priceTour;
	}

	public Date getDateTourBegin() {
		return dateTourBegin;
	}

	public void setDateTourBegin(Date dateTourBegin) {
		this.dateTourBegin = dateTourBegin;
	}

	public Date getDateTourEnd() {
		return dateTourEnd;
	}

	public void setDateTourEnd(Date dateTourEnd) {
		this.dateTourEnd = dateTourEnd;
	}

	public Time getFlytime() {
		return flytime;
	}

	public void setFlytime(Time flytime) {
		this.flytime = flytime;
	}

}
