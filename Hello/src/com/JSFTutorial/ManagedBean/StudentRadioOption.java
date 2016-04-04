package com.JSFTutorial.ManagedBean;

import javax.faces.bean.ManagedBean;
import java.util.List;
import java.util.ArrayList;


@ManagedBean
public class StudentRadioOption {
	
	private String firstName;
	private String lastName;
	private String language;
	
	/*
	//since user can select multiple languages  we need array of string
	private String[] fav_lang = {"JAVA","C++","PHP"};
	
    public String[] getFavc_lang() {
		return fav_lang;
	}


	public void setFav_lang(String[] fav_lang) {
		this.fav_lang = fav_lang;
	}
*/

    List<String> buttonOption;
	
	//no arg constructor
	public StudentRadioOption() {
		buttonOption = new ArrayList<String>();
		
		buttonOption.add("JAVA");
		buttonOption.add("C++");
		buttonOption.add("PHP");
		buttonOption.add("Python");
		
	}

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getButtonOption() {
		return buttonOption;
	}

	public void setButtonOption(List<String> buttonOption) {
		this.buttonOption = buttonOption;
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
