package data;

public class College {

	private String name;
	private String conference;
	private String division;
	private String coach;
	private String mascot;
	private String stadium;
	private String pic;

	public College() {
	}
	
	public College(String name, String conference, String division, String coach, String mascot, String stadium, String pic) {

		this.name = name;
		this.conference = conference;
		this.division = division;
		this.coach = coach;
		this.mascot = mascot;
		this.stadium = stadium;
		this.pic = pic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", conference=" + conference + ", division=" + division + ", coach=" + coach
				+ ", mascot=" + mascot + ", stadium=" + stadium + ", pic=" + pic + "]";
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String conference) {
		this.division = conference;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getMascot() {
		return mascot;
	}

	public void setMascot(String mascot) {
		this.mascot = mascot;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
}
