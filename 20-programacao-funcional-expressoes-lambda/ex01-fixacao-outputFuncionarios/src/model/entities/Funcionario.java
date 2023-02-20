package model.entities;

import java.util.Objects;

public class Funcionario {
	
	private String nome;
	private String email;
	private Double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String email, Double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
	}
	
}
