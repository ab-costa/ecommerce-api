package br.com.abcosta.ecommerceifood.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "demand")
public class Demand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "demand_id")
	private Integer demandId;
	
	@Column(name = "demand_date", nullable = false)
	private LocalDate date;
	
	@Column(name = "total", nullable = false)
	private Double total;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "payment", nullable = false)
	private Double payment;
	
	@ManyToOne
	@JoinColumn(name = "customer")
	@JsonIgnoreProperties("demandsList")
	private Customer customer;
	
	@OneToMany(mappedBy = "demand", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("demand")
	private List<DemandProduct> productsList;
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getDemandId() {
		return demandId;
	}

	public void setDemandId(Integer demandId) {
		this.demandId = demandId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}
	
	public List<DemandProduct> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<DemandProduct> productsList) {
		this.productsList = productsList;
	}
}
