package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ArticleFx {
	
	private IntegerProperty id=new SimpleIntegerProperty();
	private StringProperty name=new SimpleStringProperty();
	private StringProperty surname=new SimpleStringProperty();
	private StringProperty title=new SimpleStringProperty();
	
	public int getId() {
		return id.get();
	}
	public IntegerProperty idProperty() {
		return id;
	}
	public void setId(int id) {
		this.id.set(id);
	}
	public String getName() {
		return name.get();
	}
	public StringProperty nameProperty() {
		return name;
	}
	public void setName(String name) {
		this.name.set(name);
	}
	public String getSurname() {
		return surname.get();
	}
	public StringProperty surnameProperty() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname.set(surname);
	}
	public String getTitle() {
		return title.get();
	}
	public StringProperty titleProperty() {
		return title;
	}
	public void setTitle(String title) {
		this.title.set(title);
	}



}
