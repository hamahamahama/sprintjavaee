package com.edu.PiJEE;
// Generated 17 nov. 2016 21:49:43 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Aspnetuserclaims generated by hbm2java
 */
@Entity
@Table(name = "aspnetuserclaims", catalog = "room")
public class Aspnetuserclaims implements java.io.Serializable {

	private Integer id;
	private User user;
	private String claimType;
	private String claimValue;

	public Aspnetuserclaims() {
	}

	public Aspnetuserclaims(User user, String claimType, String claimValue) {
		this.user = user;
		this.claimType = claimType;
		this.claimValue = claimValue;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserId")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "ClaimType")
	public String getClaimType() {
		return this.claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	@Column(name = "ClaimValue")
	public String getClaimValue() {
		return this.claimValue;
	}

	public void setClaimValue(String claimValue) {
		this.claimValue = claimValue;
	}

}
