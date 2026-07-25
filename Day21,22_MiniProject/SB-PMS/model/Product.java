package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "productId")
    @NotNull
    private Long productId;

    @Column(name = "productName", length = 50)
    @NotBlank
    private String productName;

    @Column(name = "productPrice")
    @Positive
    private double productPrice;

    @Column(name = "productQuantity")
    @Positive
    private int productQuantity;
    
    private long supplierId;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", supplierId=" + supplierId + "]";
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public Product(@NotNull Long productId, @NotBlank String productName, @Positive double productPrice,
			@Positive int productQuantity, long supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.supplierId = supplierId;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}