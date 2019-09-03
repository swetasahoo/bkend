package com.niit.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	//(strategy = GenerationType.AUTO)
	private int id;
	
	
	

	@NotNull(message = "Price must be greater than 100.00")
	@Min(value = 100, message = "Price must be greater than 100.00")
	private String price;
	
	@NotEmpty(message = "Product name cannot be empty")
	private String name;
	
	@NotEmpty(message = "Product description cannot be empty")
	private String description;
	
	
	
	private String imageAddress;
	
	
	@Transient
	private MultipartFile image;
	
	private boolean enabled;
	
	public Product() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	

	public String getPrice() {
		return price;
	}

	public void setPrice(String string) {
		this.price = string;
	}

	public String getImageAddress() {
		return imageAddress;
	}

	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
