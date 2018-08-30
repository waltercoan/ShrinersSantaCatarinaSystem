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
public class Demographics {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String childFirstName;
	private String childLastName;
	private String childMiddleName;
	private String childSuffixName;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date birth;
	private Gender gender;
	private String preferredLanguage;
	private boolean interpreterRequired;
	private ParentMaritalStatus parentMaritalStatus;
	private Custody custody;
	private Living living;
	private String childHomeAddress;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private City city;
	private String zipCode;
	private String country;
	private boolean homeAddressMaillingAddress;
	private String childPermanentAddress;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private City cityChildPermanentAddress;
	private String zipCodeChildPermanentAddress;
	private String countryChildPermanentAddress;
	private String primaryHomeNumber;
	private String alternateHomeNumberOne;
	private String alternateHomeNumberTwo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChildFirstName() {
		return childFirstName;
	}
	public void setChildFirstName(String childFirstName) {
		this.childFirstName = childFirstName;
	}
	public String getChildLastName() {
		return childLastName;
	}
	public void setChildLastName(String childLastName) {
		this.childLastName = childLastName;
	}
	public String getChildMiddleName() {
		return childMiddleName;
	}
	public void setChildMiddleName(String childMiddleName) {
		this.childMiddleName = childMiddleName;
	}
	public String getChildSuffixName() {
		return childSuffixName;
	}
	public void setChildSuffixName(String childSuffixName) {
		this.childSuffixName = childSuffixName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPreferredLanguage() {
		return preferredLanguage;
	}
	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}
	public boolean isInterpreterRequired() {
		return interpreterRequired;
	}
	public void setInterpreterRequired(boolean interpreterRequired) {
		this.interpreterRequired = interpreterRequired;
	}
	public ParentMaritalStatus getParentMaritalStatus() {
		return parentMaritalStatus;
	}
	public void setParentMaritalStatus(ParentMaritalStatus parentMaritalStatus) {
		this.parentMaritalStatus = parentMaritalStatus;
	}
	public Custody getCustody() {
		return custody;
	}
	public void setCustody(Custody custody) {
		this.custody = custody;
	}
	public Living getLiving() {
		return living;
	}
	public void setLiving(Living living) {
		this.living = living;
	}
	public String getChildHomeAddress() {
		return childHomeAddress;
	}
	public void setChildHomeAddress(String childHomeAddress) {
		this.childHomeAddress = childHomeAddress;
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
	public boolean isHomeAddressMaillingAddress() {
		return homeAddressMaillingAddress;
	}
	public void setHomeAddressMaillingAddress(boolean homeAddressMaillingAddress) {
		this.homeAddressMaillingAddress = homeAddressMaillingAddress;
	}
	public String getChildPermanentAddress() {
		return childPermanentAddress;
	}
	public void setChildPermanentAddress(String childPermanentAddress) {
		this.childPermanentAddress = childPermanentAddress;
	}
	public City getCityChildPermanentAddress() {
		return cityChildPermanentAddress;
	}
	public void setCityChildPermanentAddress(City cityChildPermanentAddress) {
		this.cityChildPermanentAddress = cityChildPermanentAddress;
	}
	public String getZipCodeChildPermanentAddress() {
		return zipCodeChildPermanentAddress;
	}
	public void setZipCodeChildPermanentAddress(String zipCodeChildPermanentAddress) {
		this.zipCodeChildPermanentAddress = zipCodeChildPermanentAddress;
	}
	public String getCountryChildPermanentAddress() {
		return countryChildPermanentAddress;
	}
	public void setCountryChildPermanentAddress(String countryChildPermanentAddress) {
		this.countryChildPermanentAddress = countryChildPermanentAddress;
	}
	public String getPrimaryHomeNumber() {
		return primaryHomeNumber;
	}
	public void setPrimaryHomeNumber(String primaryHomeNumber) {
		this.primaryHomeNumber = primaryHomeNumber;
	}
	public String getAlternateHomeNumberOne() {
		return alternateHomeNumberOne;
	}
	public void setAlternateHomeNumberOne(String alternateHomeNumberOne) {
		this.alternateHomeNumberOne = alternateHomeNumberOne;
	}
	public String getAlternateHomeNumberTwo() {
		return alternateHomeNumberTwo;
	}
	public void setAlternateHomeNumberTwo(String alternateHomeNumberTwo) {
		this.alternateHomeNumberTwo = alternateHomeNumberTwo;
	}
}
/*enum Gender {
	MALE{
		@Override
		public String toString() {
			return "Masculino";
		}
	}, 
	FEMALE{
		@Override
		public String toString() {
			return "Feminino";
		}
	}, 
	UNKNOWN{
		@Override
		public String toString() {
			return "Desconhecido";
		}
	};
}*/

enum Gender {
	MALE, FEMALE, UNKNOWN;
}
enum ParentMaritalStatus {
	MARRIED, DIVORCED, SINGLE, WIDOWED, SEPARATED;
}
enum Custody {
	PARENTS, MOTHER, FATHER, CASEMANAGER, GRANDPARENTS, OTHER;
}
enum Living {
	PARENTS, MOTHER, FATHER, CASEMANAGER, GRANDPARENTS, OTHER;
}