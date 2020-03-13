package com.cts.eps.entity;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Payments")

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="country")
	private String country;
	@Column(name="state")
	private String state;
	@Column(name="zip")
	private int zip;
	@Column(name="nameCard")
	private String nameOnCard;
	@Column(name="creditNumber")
	private String creditCardNumber;
	@Column(name="exp")
	private String expiration;
	@Column(name="cvv")
	private int cvv;
	
	public Payment() {
		
	}

	public Payment(int payId, String firstName, String lastName, String email, String address, String country,
			String state, int zip, String nameOnCard, String creditCardNumber, String expiration, int cvv) {
		super();
		this.payId = payId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.nameOnCard = nameOnCard;
		this.creditCardNumber = creditCardNumber;
		this.expiration = expiration;
		this.cvv = cvv;
	}

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}
