package com.enquiry.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UsersQueries")
public class UsersQueries implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Contact_Number")
	private String contactNumber;

	@Column(name = "Email")
	private String email;

	@Column(name = "Profession")
	private String profession;

	@Column(name = "Comment")
	private String comment;

	@Column(name = "Promotional_Information")
	private String promotional_Information;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPromotional_Information() {
		return promotional_Information;
	}

	public void setPromotional_Information(String promotional_Information) {
		this.promotional_Information = promotional_Information;
	}

}
