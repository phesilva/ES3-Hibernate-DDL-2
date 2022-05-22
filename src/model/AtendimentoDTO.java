package model;

import java.time.LocalTime;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Atendimento")
public class AtendimentoDTO {

	@Id
	@Column(name = "id_atendimento")
	@NotNull
	private int id_atendimento;
	
	@Column(name = "data_atendimento")
	@NotNull
	private Date data_atendimento;
	
	@Column(name = "hora_atendimento")
	@NotNull
	private LocalTime hora_atendimento;
	
	@ManyToOne(targetEntity = ClienteDTO.class)
	@JoinColumn(name = "cpf")
	@NotNull
	private ClienteDTO cliente;
	
	public int getIdAtend() {
		return id_atendimento;
	}
	public void setIdAtend(int idAtend) {
		this.id_atendimento = idAtend;
	}
        
	public Date getdata_atendimento() {
		return data_atendimento;
	}
	public void setdata_atendimento(Date data_atendimento) {
		this.data_atendimento = data_atendimento;
	}
        
	public LocalTime gethora_atendimento() {
		return hora_atendimento;
	}
	public void setHrAtend(LocalTime hora_atendimento) {
		this.hora_atendimento = hora_atendimento;
	}
        
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
}