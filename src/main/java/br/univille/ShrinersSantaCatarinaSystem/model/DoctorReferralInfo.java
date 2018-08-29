package br.univille.ShrinersSantaCatarinaSystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DoctorReferralInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private boolean hasRefferingPhysician;
	private String doctorFirstName;
	private String doctorLastName;
	private String phoneNumber;
	private String phoneNumberSecond;
	private String officeAddress;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private City city;
	private String zipCode;
	private String country;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isHasRefferingPhysician() {
		return hasRefferingPhysician;
	}
	public void setHasRefferingPhysician(boolean hasRefferingPhysician) {
		this.hasRefferingPhysician = hasRefferingPhysician;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumberSecond() {
		return phoneNumberSecond;
	}
	public void setPhoneNumberSecond(String phoneNumberSecond) {
		this.phoneNumberSecond = phoneNumberSecond;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
