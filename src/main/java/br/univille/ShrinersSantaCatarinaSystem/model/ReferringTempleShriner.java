package br.univille.ShrinersSantaCatarinaSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferringTempleShriner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String referringTemple;
	private String referringShriner;
	private String phonenumber;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReferringTemple() {
		return referringTemple;
	}
	public void setReferringTemple(String referringTemple) {
		this.referringTemple = referringTemple;
	}
	public String getReferringShriner() {
		return referringShriner;
	}
	public void setReferringShriner(String referringShriner) {
		this.referringShriner = referringShriner;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
