package br.com.abcosta.ecommerceifood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 50, nullable= false)
	private String name;
	
	@Column(name = "description", columnDefinition = "text")
	private String description;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@Column(name = "inventory")
	private Integer inventory;
	
	@Column(name = "link_image", length = 255)
	private String linkImage;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	@JsonIgnoreProperties("productsList")
	private Department departament;
	

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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getInventory() {
		return inventory;
	}
	
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	
	public String getLinkImage() {
		return linkImage;
	}
	
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	
	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}
}
