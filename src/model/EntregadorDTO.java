package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "entregador")
public class EntregadorDTO extends FuncionarioDTO {

	@Column(name = "CNH", length = 50)
	@NotNull
	private String CNH;
	
	@Column(name = "categoria_CNH")
	@NotNull
	private char categoria;

	public String getCNH() {
		return CNH;
	}
	public void setCNH(String CNH) {
		this.CNH = CNH;
	}
	public char getcategoria() {
		return categoria;
	}
	public void setcategoria(char categoria) {
		this.categoria = categoria;
	}
}
