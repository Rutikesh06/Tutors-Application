package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutor {
	@Id
	private int tid;
	private String tuserName;
	private String tpassword;
	private String tsubject;
	private String tlocation;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTuserName() {
		return tuserName;
	}

	public void setTuserName(String tuserName) {
		this.tuserName = tuserName;
	}

	public String getTpassword() {
		return tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	public String getTsubject() {
		return tsubject;
	}

	public void setTsubject(String tsubject) {
		this.tsubject = tsubject;
	}

	public String getTlocation() {
		return tlocation;
	}

	public void setTlocation(String tlocation) {
		this.tlocation = tlocation;
	}

	public Tutor(int tid, String tuserName, String tpassword, String tsubject, String tlocation) {
		super();
		this.tid = tid;
		this.tuserName = tuserName;
		this.tpassword = tpassword;
		this.tsubject = tsubject;
		this.tlocation = tlocation;
	}

	@Override
	public String toString() {
		return "Tutor [tid=" + tid + ", tuserName=" + tuserName + ", tpassword=" + tpassword + ", tsubject=" + tsubject
				+ ", tlocation=" + tlocation + "]";
	}

	public Tutor() {

	}

}
