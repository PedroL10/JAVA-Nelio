package entities;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String nomeCliente;
	private Integer totalDeProdutos;
	private Integer prazo;
	
	public Pedido () {}

	public Pedido(String nomeCliente, Integer totalDeProdutos, Integer prazo) {
		this.nomeCliente = nomeCliente;
		this.totalDeProdutos = totalDeProdutos;
		this.prazo = prazo;
	}
	
	public int tamanhoDoPacote () {
		return totalDeProdutos * 250;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getTotalDeProdutos() {
		return totalDeProdutos;
	}

	public void setTotalDeProdutos(Integer totalDeProdutos) {
		this.totalDeProdutos = totalDeProdutos;
	}

	public Integer getPrazo() {
		return prazo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}
	
	
	
}
