package cedras.JSON;

import java.util.ArrayList;

public class Data {

	private String name;
	private String language;
	private Long id;
	private ArrayList<Data> course;
	
	

	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getPW() {
		return language;
	}
	
	public void setPW (String language) {
		this.language = language;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public ArrayList<Data> getCourse() {
		return course;
	}
	
	public void setCourse (ArrayList<Data> course) {
		this.course = course;
	}
	
	public String toString() {
	    
        return String.format("Name: %s,%n"
        		+ "Language: %s,%n"
        		+ "Id: %s,%n"
        		+ "%nCourse: %s", 
        		name, 
        		language, 
        		id, 
        		course);
    }
	
}