package exempledDiploma.models;

public class Tour {
	private int id;
	private String nameTour;
	private String dateTourBegin;
	private String dateTourEnd;
	private String flytime;
	
	@Override
	public String toString() {
		return "Tour [id=" + id + ", nameTour=" + nameTour + ", dateTourBegin=" + dateTourBegin + ", dateTourEnd="
				+ dateTourEnd + ", flytime=" + flytime + "]";
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

	public String getDateTourBegin() {
		return dateTourBegin;
	}

	public void setDateTourBegin(String dateTourBegin) {
		this.dateTourBegin = dateTourBegin;
	}

	public String getDateTourEnd() {
		return dateTourEnd;
	}

	public void setDateTourEnd(String dateTourEnd) {
		this.dateTourEnd = dateTourEnd;
	}

	public String getFlytime() {
		return flytime;
	}

	public void setFlytime(String flytime) {
		this.flytime = flytime;
	}

}
