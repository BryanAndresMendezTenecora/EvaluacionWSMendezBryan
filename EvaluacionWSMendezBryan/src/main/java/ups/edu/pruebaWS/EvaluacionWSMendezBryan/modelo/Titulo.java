package ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Titulo {

	@Id
	private int codigo;
	private String nombre;
	
	@OneToOne
	@JoinColumn(name = "cedula")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name ="codigo")
	private Estado estado;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
