package com.cjc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Parent {
	@Id
	private int pid;
	private String pemail;
	private String pname;
	private String password;
	private String address;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Tutor> tutor;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Books> books;

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Tutor> getTutor() {
		return tutor;
	}

	public void setTutor(List<Tutor> tutor) {
		this.tutor = tutor;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Parent [pid=" + pid + ", pemail=" + pemail + ", pname=" + pname + ", password=" + password
				+ ", address=" + address + ", tutor=" + tutor + ", books=" + books + "]";
	}

	public Parent(int pid, String pemail, String pname, String password, String address, List<Tutor> tutor,
			List<Books> books) {
		super();
		this.pid = pid;
		this.pemail = pemail;
		this.pname = pname;
		this.password = password;
		this.address = address;
		this.tutor = tutor;
		this.books = books;
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
