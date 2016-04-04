package Bean_Demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;


@ManagedBean
@ApplicationScoped
public class Counter {
	
	private int value = 0;
	
	public Counter(){
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment(){
		
		value++;
	}

}
