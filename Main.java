import java.io.IOException;
import java.util.*;
import java.util.concurrent.*; 
import java.util.Date;

//import javafx.scene.control.Menu;
class Main {
  
	private static RecordManager recordManager = new RecordManager();
    Scanner in = new Scanner ( System.in );
    SpecimanModel specimanModel=null;
    String a = "Leatherback";
    String b = "Loggerhead";
    String c = "Green";
    String d = "Flatback";
    String e = "Hawksbill";
    String f = "Kemp’s ridley";
    String g = "Olive ridley";   
    String z="0", o="1", t="2";
	
	public void option1Menu() throws InterruptedException, IOException {
		
  	 // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

  	//System.out.printf("%40s", "HI");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	    System.out.println ( "a. Enter a new record\nb. View an Existing record\nc. Edit an Existing record\nd. delete an existing record \ne. Exit to main menu" );
	    System.out.println( "Selection: " );

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	    Scanner in = new Scanner ( System.in );
	    String input = in.nextLine();
		switch ( input ) {
	      case "a":
	
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	    	  
	  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	  		System.out.println();
	    	  System.out.println("welcome to text-based system.\n Add a new record");
	    	  System.out.println();
	  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	  		System.out.println();
	  		System.out.println ( "1. Leatherback\n2. Loggerhead\n3. Green\n4. Flatback \n5. Hawksbill \n6. Kemp’s ridley\n7. Olive ridley" );
		    System.out.println( "Select Species: " );
		    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		    
		    Scanner in1 = new Scanner ( System.in );
		    String specie = in.nextLine();
		    

		    
		    switch ( specie ) {
		      case "1":
		    	  specie = a;
		    	  break;
		      case "2":
		    	  specie = b;
		    	  break;
		      case "3":
		    	  specie =c;
		    	  break;
		      case "4":
		    	  specie = d;
		    	  break;
		      case "5":
		    	  specie = e;
		    	  break;
		      case "6":
		    	  specie = f;
		    	  break;
		      case "7":
		    	  specie = g;
		    	  break;
		      default:
		          System.err.println ( "Unrecognized option..! Try Again.." ); 
		          option1Menu();
		    }
	    	//System.out.println ( "Enter Specie: " );
	        //String specie = in.nextLine();
		    
		    //System.out.println ( "Enter Record Number: " );
	        //String recordNum = in.nextLine();
		    
	        System.out.println ( "Enter weight in kg: " );
	        String weight = in.nextLine();
	        
	        System.out.println ( "Enter length in cm: " );
	        String length = in.nextLine();

	        System.out.println ( "Select number of working flippers: \n1. 0 (zero)\n2. 1 (one)\n3. 2 (Two)\n" );
	        System.out.println ("");
	        System.out.println ("Choose: ");
		    Scanner in5 = new Scanner ( System.in );
		    String flipper = in.nextLine();
		    
		    
		    switch ( flipper ) {
		      case "1":
		    	  flipper = z;
		    	  break;
		      case "2":
		    	  flipper = o;
		    	  break;
		      case "3":
		    	  flipper =t;
		    	  break;

		      default:
		          System.err.println ( "Unrecognized option..! Try Again.." ); 
		          option1Menu();
		    }
	        
	        

	        System.out.println ( "Enter location: " );
	        String location = in.nextLine();
	        
	        System.out.println ( "Added SuccessFully" );
	        System.out.println();System.out.println();
	        recordManager.addRecord(specie,weight, length, flipper , location);

	        option1Menu();
	        
	        break;
	      case "b":
	          
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		    	  System.out.println("welcome to text-based system.\n view an existing record");
		    	  System.out.println();
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
	    	  
		  		System.out.println ( "1. Leatherback\n2. Loggerhead\n3. Green\n4. Flatback \n5. Hawksbill \n6. Kemp’s ridley\n7. Olive ridley" );
			    System.out.println( "Select Species: " );
			    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			    
			    Scanner in2 = new Scanner ( System.in );
			    specie = in.nextLine();
			    

			    
			    switch ( specie ) {
			      case "1":
			    	  specie = a;
			    	  break;
			      case "2":
			    	  specie = b;
			    	  break;
			      case "3":
			    	  specie =c;
			    	  break;
			      case "4":
			    	  specie = d;
			    	  break;
			      case "5":
			    	  specie = e;
			    	  break;
			      case "6":
			    	  specie = f;
			    	  break;
			      case "7":
			    	  specie = g;
			    	  break;
			      default:
			          System.err.println ( "Unrecognized option..!" ); 
			          option1Menu();
			    }
	          
	          List<SpecimanModel> specimanModels = recordManager.viewRecord(specie);
	          
	          
	          if(specimanModels.size()==0){
	        	  
	        	  System.out.println ( "Given specie does not exist" );
	        	  
	          }else{
	        	  for(SpecimanModel specimanModel : specimanModels){
	        	  
	        	  System.out.println("Specie : "+specimanModel.getSpecie());
	        	  //System.out.println("Record Number : "+specimanModel.getrecordNum());
	        	  System.out.println("Weight : "+specimanModel.getWeight());
	        	  System.out.println("Length : "+specimanModel.getLength());
	        	  System.out.println("Flippers : "+specimanModel.getWorkingFlipper());
	        	  System.out.println("Location : "+specimanModel.getLocation());

	        	  
	        	  }
	          }
	          System.out.println();System.out.println();
	        
	          option1Menu();
	        break;
	      case "c":        
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

	    	 
	        
	    	  
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		  		 System.out.println("welcome to text-based system.\n Edit an existing record");
		  		 System.out.println();
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		  		
	    	  
		  		System.out.println ( "1. Leatherback\n2. Loggerhead\n3. Green\n4. Flatback \n5. Hawksbill \n6. Kemp’s ridley\n7. Olive ridley" );
			    System.out.println( "Select Species: " );
			    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			    
			    Scanner in3 = new Scanner ( System.in );
			    specie = in.nextLine();
			    
			 
			    switch ( specie ) {
			      case "1":
			    	  specie = a;
			    	  break;
			      case "2":
			    	  specie = b;
			    	  break;
			      case "3":
			    	  specie =c;
			    	  break;
			      case "4":
			    	  specie = d;
			    	  break;
			      case "5":
			    	  specie = e;
			    	  break;
			      case "6":
			    	  specie = f;
			    	  break;
			      case "7":
			    	  specie = g;
			    	  break;
			      default:
			          System.err.println ( "Unrecognized option..! Try Again.." ); 
			          option1Menu();
			    }
	        
	        List<SpecimanModel> specimanModels2 = recordManager.viewRecord(specie);
	        //specimanModel = recordManager.viewRecord(specie);
	          if(specimanModels2.size()==0){
	        	  
	        	  System.out.println ( "Given specie does not exist" );
	        	  
	          }else{
	        	  for(SpecimanModel specimanModel : specimanModels2){
	        	  
	        	  System.out.println("Specie : "+specimanModel.getSpecie());
	        	  //System.out.println("Record Number : "+specimanModel.getrecordNum());
	        	  System.out.println("Weight : "+specimanModel.getWeight());
	        	  System.out.println("Length : "+specimanModel.getLength());
	        	  System.out.println("Flippers : "+specimanModel.getWorkingFlipper());
	        	  System.out.println("Location : "+specimanModel.getLocation());
				  

	        	  System.out.println();System.out.println();
	        	  
		        	 System.out.print( "Enter new Weigth in kg:" );
		        	 weight = in.nextLine();
		        	 System.out.print( "Enter new length in cm:" );
		        	 length = in.nextLine();
		        	 
		        	System.out.println ( "Select number of working flippers: \n1. 0 (zero)\n2. 1 (one)\n3. 2 (Two)\n" );
		 	        System.out.println ("");
		 	        System.out.print("Choose: ");
		 		    Scanner in6 = new Scanner ( System.in );
		 		    flipper = in.nextLine();
		 		    
		 		    
		 		    switch ( flipper ) {
		 		      case "1":
		 		    	  flipper = z;
		 		    	  break;
		 		      case "2":
		 		    	  flipper = o;
		 		    	  break;
		 		      case "3":
		 		    	  flipper =t;
		 		    	  break;

		 		      default:
		 		          System.err.println ( "Unrecognized option..!" ); 
		 		          option1Menu();
		 		    }
					
					 System.out.println ( "Enter new location" );
		        	 location = in.nextLine();	
		 		           	
		        	 
		        	 System.out.println ( "Edited SuccessFully" );
		        	 recordManager.editRecord(specie, weight, length, flipper, location);
	        	  }
	          }
	          
	        
	        System.out.println();System.out.println();
	      
	        option1Menu();

	        break;
	      
	      case "d":     
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	    	  
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		    	  System.out.println("welcome to text-based system.\n Delete a record");
		  		 System.out.println();
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		  		
	    	  
		  		System.out.println();
		  		System.out.println ( "1. Leatherback\n2. Loggerhead\n3. Green\n4. Flatback \n5. Hawksbill \n6. Kemp’s ridley\n7. Olive ridley" );
			    System.out.println( "Select Species: " );
			    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			    
			    Scanner in4 = new Scanner ( System.in );
			    specie = in.nextLine();
			    

			    
			    switch ( specie ) {
			      case "1":
			    	  specie = a;
			    	  break;
			      case "2":
			    	  specie = b;
			    	  break;
			      case "3":
			    	  specie =c;
			    	  break;
			      case "4":
			    	  specie = d;
			    	  break;
			      case "5":
			    	  specie = e;
			    	  break;
			      case "6":
			    	  specie = f;
			    	  break;
			      case "7":
			    	  specie = g;
			    	  break;
			      default:
			          System.err.println ( "Unrecognized option..! Try Again..:" ); 
			          option1Menu();
			    }  	
	    	  
	          recordManager.deleteRecord(specie);
	          System.out.println ( "Deleted SuccessFully" );
	          System.out.println();System.out.println();
	          
	          option1Menu();
	      break;
	      
	      case "e":
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	    	  display_maiMenu();
	      break;

	      default:
	          System.err.println ( "Unrecognized option..! Select Again:" ); 
	          option1Menu();
	          
		}
	}
  

	public void option2Menu() throws InterruptedException, IOException {
	    
  	 // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
		System.out.println ( "a. Search for an existing record \nb. Generate a summary report \nc. Exit to main menu" );
	    System.out.println( "Selection: " );
	    
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	    Scanner in = new Scanner ( System.in );
	      String location;
	      String fromWeight;
	      String toWeight;
	      
		switch(in.nextLine()){
	      case "a":
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 

		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		    	  System.out.println("welcome to text-based system.\n search for existing record");
		  		 System.out.println();
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		  		
	    	  System.out.println ( "Enter location of speciman: " );
	          location = in.nextLine();
	          
	    	  System.out.println ( "Enter from weight of speciman in kg: " );
	          fromWeight = in.nextLine();
	          
	          System.out.println ( "Enter to weight of speciman in kg: " );
	          toWeight = in.nextLine();
	          

	          List<SpecimanModel> specimanModels = recordManager.searchRecord(location, fromWeight , toWeight);
	          
	          if(specimanModels.size()==0){
	        	  
	        	  System.out.println ( "Given specie does not exist" );
	        	  
	          }else{
	        	  for(SpecimanModel specimanModel : specimanModels){
	        	  
	        	  System.out.println("Specie : "+specimanModel.getSpecie());
	        	  System.out.println("Weight : "+specimanModel.getWeight());
	        	  System.out.println("Length : "+specimanModel.getLength());
	        	  System.out.println("Flippers : "+specimanModel.getWorkingFlipper());
	        	  System.out.println("Location : "+specimanModel.getLocation());

	        	  
	        	  }
	          }
	          System.out.println();System.out.println();
	        
	          option2Menu();
	      break;
	      
	      case "b":     
	    	  String locationSpeci;
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	    	  
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		    	  System.out.println("welcome to text-based system.\n Generate report");
		    	  System.out.println ( "1.By Location: " );
		    	  System.out.println ( "2.Summary " );
		    	  System.out.println();
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  		System.out.println();
		  		

	    	  
	    	  int value = in.nextInt();
	    	  
	    	  List<SpecimanModel> specimanModelsList = recordManager.getSpecimanModelList();
	    	  if(value==1){

	    		  System.out.println ( "Enter location to search : " );
	    		  Scanner input = new Scanner(System.in);
	    		  locationSpeci = input.nextLine();
	    		  
	    		  List<SpecimanModel> specimanModels2 = recordManager.getSpecimanByLocation(locationSpeci);

		          System.out.println ( "Summary Report: " );
		          if(specimanModels2.size()==0){
		        	  
		        	  System.out.println ( "Given specie does not exist" );
		        	  
		          }else{

	    		  for(SpecimanModel specimanModel : specimanModels2){
	    			  
	    	      	  System.out.println("Specie : "+specimanModel.getSpecie());
	    	      	  System.out.println("Weight : "+specimanModel.getWeight());
	    	      	  System.out.println("Length : "+specimanModel.getLength());
	    	      	  System.out.println("Flippers : "+specimanModel.getWorkingFlipper());
	    	      	  System.out.println("Location : "+specimanModel.getLocation());
	    		  }
	    		  
		          }
	    	  }if(value ==2){
	    		  
		          System.out.println ( "Summary Report: " );
		          
	    		  Collections.sort(specimanModelsList, new Comparator<SpecimanModel>() {
	    			    public int compare(SpecimanModel v1, SpecimanModel v2) {
	    			        return v1.getDate().compareTo(v2.getDate());
	    			    }
	    			});

		    	  System.out.println ();
		    	  System.out.println ();
		    	  

		    	  
		          recordManager.generateSummary();
	    	  }
	    	 
	          System.out.println();System.out.println();
	          
	          option2Menu();
	          break;
	          
	      case "c":
	    	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	    	  display_maiMenu();
	      break;
	      
	      default:
	          System.err.println ( "Unrecognized option..! Select Again:" ); 
	          option2Menu();
	      }
	    
	        
	  }
	
	public void display_maiMenu() throws InterruptedException, IOException{
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	    System.out.println ( "					MENU SELECTION\n"
	    		+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
	    		+ "\nOptions:\n\n 1. General Function\n 2. Advanced Function\n 3. Exit\n\nSelect option: " );
	    
	    System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	    int input = in.nextInt();
	    
	    System.out.println( "Function "+input+" selected" );
	    
	    switch(input){
	    
	    case 1:
	    	option1Menu();
	    break;
	    
	    
	    case 2:
	    	option2Menu();
		break;
		    
	    case 3:
	    	System.out.println("Thank you for using the text based system");
			TimeUnit.SECONDS.sleep(3);
		break;

	    default:
	          System.err.println ( "Unrecognized option..! Select Again:" ); 
	          display_maiMenu();
	    	
	    }
	    	    
	}

    public static void main ( String[] args ) throws InterruptedException, IOException {
    Main main = new Main();
    main.display_maiMenu();
  }
}