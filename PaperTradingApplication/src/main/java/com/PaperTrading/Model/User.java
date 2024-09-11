package com.PaperTrading.Model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int userId;
    @Column(name = "UName")
    private String uName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Balance")
    private BigDecimal balance;
    
    private BigDecimal Invested;
    

	public BigDecimal getInvested() {
		return Invested;
	}

	public void setInvested(BigDecimal invested) {
		Invested = invested;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal d) {
		this.balance = d;
	}

	public User(int userId, String uName, String email, String password, BigDecimal balance, BigDecimal invested) {
		super();
		this.userId = userId;
		this.uName = uName;
		this.email = email;
		this.password = password;
		this.balance = balance;
		Invested = invested;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


    

}
