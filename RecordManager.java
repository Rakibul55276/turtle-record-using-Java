import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordManager implements Specimen, Specimen1, Specimen2, Specimen3, Specimen4, Specimen5, Specimen6{

	private static List<SpecimanModel> specimanModelList = new ArrayList<>();
	
	
	
	public static List<SpecimanModel> getSpecimanModelList() {
		return specimanModelList;
	}

	public static void setSpecimanModelList(List<SpecimanModel> specimanModelList) {
		RecordManager.specimanModelList = specimanModelList;
	}

	@Override
	public void addRecord(String specie,String weight, String length, String flipper, String location) {
		// TODO Auto-generated method stub
		//String recordNum, 
		SpecimanModel specimanModel = new SpecimanModel();
		specimanModel.setLength(length);
		specimanModel.setWeight(weight);
		specimanModel.setSpecie(specie);
		//specimanModel.setrecordNum(recordNum);
		specimanModel.setWorkingFlipper(flipper);
		specimanModel.setLocation(location);
		specimanModel.setDate(new Date());
		
		specimanModelList.add(specimanModel);
	}

	@Override

	
	public List<SpecimanModel> viewRecord(String specie){
		
		List<SpecimanModel> temp= new ArrayList<>();
		for(SpecimanModel specimanModel : specimanModelList){
			
			if(specimanModel.getSpecie().equals(specie)){
				
				temp.add(specimanModel);
			}
		}
		return temp;
		
	}
	

@Override
	public void editRecord(String specie , String weight , String length , String flipper , String location) {
		// TODO Auto-generated method stub
		for(SpecimanModel specimanModel : specimanModelList){
			if(specimanModel.getSpecie().equals(specie)){
				specimanModel.setWeight(weight);
				specimanModel.setLength(length);
				specimanModel.setWorkingFlipper(flipper);
				specimanModel.setLocation(location);
			}
		}
	}

	@Override
	public void deleteRecord(String specie) {
		// TODO Auto-generated method stub
	
		List<SpecimanModel> specimanModels = new ArrayList<>();
		for(SpecimanModel specimanModel : specimanModelList){
			if(specimanModel.getSpecie().equals(specie)){
			
			}else{
				specimanModels.add(specimanModel);
			}
		}
		specimanModelList = specimanModels;
	}

	@Override
	public List<SpecimanModel> searchRecord(String location, String fromWeight ,String toWeight) {
		
		
		
		
				
		// TODO Auto-generated method stub
		
		List<SpecimanModel> specimanModels= new ArrayList<>();
		for(SpecimanModel specimanModel : specimanModelList){
			
			if(specimanModel.getLocation().equals(location) && Integer.parseInt(specimanModel.getWeight()) > Integer.parseInt(fromWeight) && Integer.parseInt(specimanModel.getWeight()) < Integer.parseInt(toWeight) )
			{
				specimanModels.add(specimanModel);
			}
		}

			/*if(Integer.parseInt(specimanModel.getWeight()) > Integer.parseInt(fromWeight) && Integer.parseInt(specimanModel.getWeight()) < Integer.parseInt(toWeight) )
			{
				specimanModels.add(specimanModel);
			}
		}
		*/
		return specimanModels;
	}

	
	public List<SpecimanModel> getSpecimanByLocation(String location){
		
		List<SpecimanModel> temp= new ArrayList<>();
		for(SpecimanModel specimanModel : specimanModelList){
			
			if(specimanModel.getLocation().equals(location)){
				
				temp.add(specimanModel);
			}
		}
		return temp;
		
	}
	
	@Override
	public void generateSummary() {
		// TODO Auto-generated method stub
		
		for(SpecimanModel specimanModel : specimanModelList){
			
      	  System.out.println("Specie : "+specimanModel.getSpecie());
      	  System.out.println("Width : "+specimanModel.getWeight());
      	  System.out.println("Length : "+specimanModel.getLength());
      	  System.out.println("Flippers : "+specimanModel.getWorkingFlipper());
      	  System.out.println("Location : \n"+specimanModel.getLocation());
		}
	}
	

	public void exitfunction() {

	}

	@Override
	public List<SpecimanModel> searchRecord(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
