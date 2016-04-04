package TourBean;

import javax.faces.bean.ManagedBean;
import java.util.List;


@ManagedBean
public class KindOfTour {
	
	private String TourType;
	
	public KindOfTour(){
		
	}

	public String getTourType() {
		return TourType;
	}

	public void setTourType(String tourType) {
		TourType = tourType;
	}
	
	public String tourMethod(){
		if(TourType!=null && TourType.equals("city")){
			return "City_Tour";
		}else{
			return "Country_Tour";
		}
	}

}
