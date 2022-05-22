package model;

import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Atendente")
public class AtendenteDTO extends FuncionarioDTO {

	@Column(name = "Entrada")
	@NotNull
	private LocalTime hora_entrada;
	
	@Column(name = "Saida")
	@NotNull
	private LocalTime hora_Saida;
	
	@Column(name = "email", length = 50)
	@NotNull
	private String email;
	
	public LocalTime gethora_entrada() {
		return hora_entrada;
	}
	public void sethora_entrada(LocalTime hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public LocalTime gethora_Saida() {
		return hora_Saida;
	}
	public void sethora_Saida(LocalTime hora_Saida) {
		this.hora_Saida = hora_Saida;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}