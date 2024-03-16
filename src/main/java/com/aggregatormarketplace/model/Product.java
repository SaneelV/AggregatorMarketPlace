package com.aggregatormarketplace.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private String  productDescription;
	private int Status;
	private Date createdDate;
	private Date UpdatedDate;

/*	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "approvedBy", referencedColumnName = "userId")
	private Users approvedBy;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "createdBy", referencedColumnName = "userId")
	private Users createdBy;*/

	public Product() {
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
}