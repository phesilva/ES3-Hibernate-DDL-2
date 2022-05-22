package model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "Funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class FuncionarioDTO {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@Column(name = "nome", length = 200)
	@NotNull
	private String nome;
	
	@Column(name = "data_nascimento")
	@NotNull
	private Date data_nascimento;
	
	@Column(name = "salario")
	@NotNull
	private double salario;
	
	@Column(name = "contato", length = 15)
	@NotNull
	private String contato;
	
	@ManyToOne(targetEntity = AtendimentoDTO.class)
	@JoinColumn(name = "id_atendimento")
	@NotNull
	private AtendimentoDTO atendimento;
	
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
	public Date getdata_nascimento() {
		return data_nascimento;
	}
	public void setdata_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getcontato() {
		return contato;
	}
	public void setcontato(String contato) {
		this.contato = contato;
	}
	public AtendimentoDTO getatendimento() {
		return atendimento;
	}
	public void setatendimento(AtendimentoDTO atendimento) {
		this.atendimento = atendimento;
	}
}
