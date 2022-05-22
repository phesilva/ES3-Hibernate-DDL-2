package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Cliente")
public class ClienteDTO {

	@Id
	@Column(name = "cpf", length = 11)
	@NotNull
	private String cpf;
	
	@Column(name = "nome", length = 200)
	@NotNull
	private String nome;
	
	@Column(name = "contato", length = 15)
	@NotNull
	private String contato;
	
	@Column(name = "email", length = 50)
	@NotNull
	private String email;
	
	@Column(name = "pronome", length = 10)
	@NotNull
	private String pronome;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcontato() {
		return contato;
	}
	public void setcontato(String contato) {
		this.contato = contato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPronome() {
		return pronome;
	}
	public void setPronome(String pronome) {
		this.pronome = pronome;
	}
}
