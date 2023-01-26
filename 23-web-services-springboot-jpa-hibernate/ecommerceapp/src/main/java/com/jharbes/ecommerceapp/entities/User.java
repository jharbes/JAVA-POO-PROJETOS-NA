package com.jharbes.ecommerceapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

//utilizamos essa biblioteca jakarta.persistence.Entity pois ela eh a 
// especificacao da jpa de entidade, e o org.hibernate eh a 
// implementacao, o ideal eh fazer a classe depender da especificacao e nao da implementacao
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//utilizaremos essa notacao pois a palavra user (nome da classe) é reservado no
// banco de dados h2, entao ao criar essa tabela poderia haver conflito
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	// informando ao JPA que a chave primaria será auto incremental
	// no banco de dados
	@Id // informo ao JPA que essa (id) é a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;

	// informando que do outro lado esse atributo List<Order> está manipulado pelo
	// atributo client
	@OneToMany(mappedBy = "client")
	@JsonIgnore // para evitar o loop infinito de pedidos chamando user e user chamando pedidos
	private List<Order> orders = new ArrayList<>();

	public User() { // utilizando o Spring boot é obrigatorio a criacao de um construtor vazio
	}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}