package com.luisgomezcaballero.phoneapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ShopOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Phone> cart = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Phone> getCart() {
		return cart;
	}

	public void setCart(List<Phone> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", cart=" + cart
				+ "]";
	}

}
