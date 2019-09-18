package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="ARTICLES")
public class Article implements BaseModel {

	public Article() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surname;
	}

	public void setSurName(String surname) {
		this.surname = surname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@DatabaseField(generatedId=true)
	private int id;
	
	@DatabaseField(columnName="NAME", canBeNull=false, unique=true)
	private String name;
	
	@DatabaseField(columnName="SURNAME", canBeNull=false, unique=true)
	private String surname;
	
	@DatabaseField(columnName="TITLE", canBeNull=false)
	private String title;
	
}
