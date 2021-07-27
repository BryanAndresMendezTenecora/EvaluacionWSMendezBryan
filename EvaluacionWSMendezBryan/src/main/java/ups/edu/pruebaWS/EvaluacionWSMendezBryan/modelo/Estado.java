package ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id
	private int codigo;
	private String estado;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
