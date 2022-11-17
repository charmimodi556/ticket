package com.ticket;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Visitors {

	@Id
	int vid;
	@Column
	String vname;
	@Column
	int vage;
	
	@OneToOne
	@JoinColumn(name="ticketId", referencedColumnName="id")
	Ticket ticket;

	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getVage() {
		return vage;
	}
	public void setVage(int vage) {
		this.vage = vage;
	}
	

	public Visitors(int vid, String vname, int vage, Ticket ticket) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vage = vage;
		this.ticket = ticket;
	}
	public Visitors() {
		super();
	}
	@Override
	public String toString() {
		return "Visitors [vid=" + vid + ", vname=" + vname + ", vage=" + vage + ", ticket=" + ticket + "]";
	}
	
	
	
	
}
