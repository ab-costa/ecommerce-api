package br.com.abcosta.ecommerceifood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length  = 100, nullable = false)
	private String name;
	
	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "phone", nullable = false)
	private Integer phone;
	
	@Column(name = "public_place", length = 50, nullable = false)
	private String publicPlace;
	
	@Column(name = "number")
	private Integer number;
	
	@Column(name ="complement", length = 30)
	private String complement;
	
	@Column(name = "neighborhood", length = 30, nullable = false)
	private String neighborhood;
	
	@Column(name = "city", length = 30, nullable = false)
	private String city;
	
	@Column(name = "state", length = 2, nullable = false)
	private String state;
	
	@Column(name = "zip_code", length = 8, nullable  =false)
	private String zipCode;
	
	
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getPhone() {
		return phone;
	}
	
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	public String getPublicPlace() {
		return publicPlace;
	}
	
	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public String getNeighborhood() {
		return neighborhood;
	}
	
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
