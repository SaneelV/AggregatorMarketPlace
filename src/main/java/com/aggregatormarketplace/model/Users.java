package com.aggregatormarketplace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="UserId")
    private Long userId;
    
    @Column(name="Username")
    private String username;
    
    @Column(name="Password")
    private String password;
    
    @Column(name="Role")
    private String role;
    
    @Column(name="Page")
    private String page;
    
    
    
	public Users() {
	
	}
	
	
	public Users(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
  
	
    
    
}