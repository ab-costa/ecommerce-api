package br.com.abcosta.ecommerceifood.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "customer_name", length =100, nullable = false)
	private String customerName;
	
	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "phone", nullable = false)
	private Integer phone;
	
	@Column(name = "public_place", length = 50, nullable = false)
	private String publicPlace;
	
	@Column(name = "address_number")
	private String addressNumber;
	
	@Column(name = "complement", length = 30)
	private String complement;
	
	@Column(name = "neighborhood", length = 30, nullable = false)
	private String neighborhood;
	
	@Column(name = "city", length = 30, nullable = false)
	private String city;
	
	@Column(name = "state", length = 2, nullable = false)
	private String state;
	
	@Column(name = "zip_code", length =8, nullable = false)
	private String zipCode;
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnoreProperties("customer")
	private List<Demand> demandsList;
	

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
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
	
	public List<Demand> getDemandsList() {
		return demandsList;
	}

	public void setDemandsList(List<Demand> demandsList) {
		this.demandsList = demandsList;
	}
}
