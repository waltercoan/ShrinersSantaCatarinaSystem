package br.univille.ShrinersSantaCatarinaSystem.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LegalGuardianInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private boolean notApplicable;
	private String firstName;
	private String lastName;
	private String middleName;
	private String suffixName;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date birth;
	private boolean addressSameAsChild;
	private String homeAddress;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private City city;
	private String zipCode;
	private String country;
	private String phoneNumberPrimary;
	private String phoneNumberSecundary;
	private String relationshipToChild;
	
	public LegalGuardianInfo() {
		this.setRelationshipToChild("OTHER");
	}
	
	public LegalGuardianInfo(String relationshipToChild) {
		this.setRelationshipToChild(relationshipToChild);
	}
	
	
	
	public String getPhoneNumberPrimary() {
		return phoneNumberPrimary;
	}
	public void setPhoneNumberPrimary(String phoneNumberPrimary) {
		this.phoneNumberPrimary = phoneNumberPrimary;
	}
	public String getPhoneNumberSecundary() {
		return phoneNumberSecundary;
	}
	public void setPhoneNumberSecundary(String phoneNumberSecundary) {
		this.phoneNumberSecundary = phoneNumberSecundary;
	}
	public String getRelationshipToChild() {
		return relationshipToChild;
	}
	public void setRelationshipToChild(String relationshipToChild) {
		this.relationshipToChild = relationshipToChild;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isNotApplicable() {
		return notApplicable;
	}
	public void setNotApplicable(boolean notApplicable) {
		this.notApplicable = notApplicable;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSuffixName() {
		return suffixName;
	}
	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public boolean isAddressSameAsChild() {
		return addressSameAsChild;
	}
	public void setAddressSameAsChild(boolean addressSameAsChild) {
		this.addressSameAsChild = addressSameAsChild;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
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
