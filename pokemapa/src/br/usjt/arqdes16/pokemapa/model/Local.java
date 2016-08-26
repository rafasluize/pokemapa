package br.usjt.arqdes16.pokemapa.model;

import java.io.Serializable;

public class Local implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private double latitude, longitude;
	private String imagem;
	private int cidade;
	private String nomeCidade;
	private int tipo;
	private String nomeTipo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	@Override
	public String toString() {
		return "Local [id=" + id + ", nome=" + nome + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", imagem=" + imagem
				+ ", cidade=" + cidade + ", nomeCidade=" + nomeCidade
				+ ", tipo=" + tipo + ", nomeTipo=" + nomeTipo + "]";
	}
}
