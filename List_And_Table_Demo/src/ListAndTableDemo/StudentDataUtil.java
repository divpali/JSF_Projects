package ListAndTableDemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import java.util.List;
import java.util.ArrayList;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	public StudentDataUtil(){
		loadSampleData();
			
	}
	
	public void loadSampleData(){
		students = new ArrayList<Student>();
		
		students.add(new Student("Divya","Paliwal"));
		students.add(new Student("Ajay","Singh"));
		students.add(new Student("Poonam","Kumari"));
		
		
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
