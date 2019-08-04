import java.util.Date;

public class SpecimanModel {

	private String specie;
	private String recordNum;
	private String length;
	private String weight;
	private String workingFlipper;
	private String location;
	private Date date;
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSpecie() {
		return specie;
	}
	
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	public String getrecordNum() {
		return recordNum;
	}
	public void setrecordNum(String recordNum) {
		this.recordNum = recordNum;
	}
	
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWorkingFlipper() {
		return workingFlipper;
	}
	public void setWorkingFlipper(String workingFlipper) {
		this.workingFlipper = workingFlipper;
	}
}
