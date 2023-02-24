package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDemo")
public class StudentDemo {

	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="sdept")
	private String sdept;
	@Column(name="semail")
	private String semail;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public StudentDemo(int sid, String sname, String sdept, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdept = sdept;
		this.semail = semail;
	}
	public StudentDemo()
	{
		
	}
}
