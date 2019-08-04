import java.util.List;

public interface Specimen {

	public void addRecord(String specie,String width , String length , String flipper ,  String location);
	
}
interface Specimen1 {
	public List<SpecimanModel> viewRecord(String specie);
	
}
interface Specimen2 {
	public void editRecord(String specie , String weight , String length , String flipper, String location);
	public List<SpecimanModel> viewRecord(String specie);
}

interface Specimen3 {

	public void deleteRecord(String specie);
	
}

interface Specimen4 {

	public List<SpecimanModel> searchRecord(String location, String fromWeight ,String toWeight);
	
}

interface Specimen5 {

	public void generateSummary();
	
}

interface Specimen6 {

	public List<SpecimanModel> searchRecord(String location);
	
}
