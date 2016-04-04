package ValidationDemo;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student1 {
	
	
	private String FirstName;
	private String LastName;
	private String CourseCode;
	
	public Student1(){
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	
	public void validateTheCourseCode(FacesContext faceContext, UIComponent uiComponent, String value){
		
		if(value==null){
			return;
		}
		
		String data = value.toString();
		
		if(!data.startsWith("DIV")){
			FacesMessage message = new FacesMessage("The input must start with DIV");
			
			throw new ValidatorException(message);
		}
		
	}

}
