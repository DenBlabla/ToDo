package object.business;

import java.util.Date;

public class Business {
	private int id;
	private String title;
	private String discription;
	private Date dateCreate;
	private Date dateEdit;
	private Date dateResolved;
	private int theme;
	private int icon;
	private int user;
	private int status;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDiscription() {
		return discription;
	}
	
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public Date getDateCreate() {
		return dateCreate;
	}
	
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	
	public Date getDateEdit() {
		return dateEdit;
	}
	
	public void setDateEdit(Date dateEdit) {
		this.dateEdit = dateEdit;
	}
	
	public Date getDateResolved() {
		return dateResolved;
	}
	
	public void setDateResolved(Date dateResolved) {
		this.dateResolved = dateResolved;
	}
	
	public int getTheme() {
		return theme;
	}
	
	public void setTheme(int theme) {
		this.theme = theme;
	}
	
	public int getIcon() {
		return icon;
	}
	
	public void setIcon(int icon) {
		this.icon = icon;
	}
	
	public int getUser() {
		return user;
	}
	
	public void setUser(int user) {
		this.user = user;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

}
