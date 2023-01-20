package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private String nome;
	private Date retirada;
	private Date retorno;
	private float precoPorHora;
	private float precoPorDia;
	
	public Locacao() {
	}

	public Locacao(String nome, Date retirada, Date retorno, float precoPorHora, float precoPorDia) {
		super();
		this.nome = nome;
		this.retirada = retirada;
		this.retorno = retorno;
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getRetirada() {
		return retirada;
	}

	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public float getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(float precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public float getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(float precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	
}
