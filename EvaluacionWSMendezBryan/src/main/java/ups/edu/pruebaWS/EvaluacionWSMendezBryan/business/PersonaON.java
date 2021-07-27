package ups.edu.pruebaWS.EvaluacionWSMendezBryan.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.pruebaWS.EvaluacionWSMendezBryan.dao.PersonaDAO;
import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Persona;


@Stateless
public class PersonaON {

	@Inject
	private PersonaDAO daoPersona;
	

	public void insertCliente(Persona persona) throws Exception {
		
		if(!this.validaCedula(persona.getCedula()))
			throw new Exception("Cedula incorrecta");
			
		daoPersona.insert(persona);	
	}

	public void updateCliente(Persona persona) throws Exception {
		
		if(!this.validaCedula(persona.getCedula()))
			throw new Exception("Cedula incorrecta");
		persona.setApellido("Tenecora");
		daoPersona.update(persona);
	}
	
	public void deleteCliente(Persona persona) throws Exception {
		
		if(!this.validaCedula(persona.getCedula()))
			throw new Exception("Cedula incorrecta");
		String cedula= persona.getCedula();
		daoPersona.delete(cedula);
	}
	
	public List<Persona> getClientes() {
		
		//if(!this.validaCedula(persona.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Persona per= daoPersona.read("0102930888");
		
		return daoPersona.getPersonas("%");
	}
	
	/*
	public List ListarCliente() throws Exception {
		
		
		//String cedula= persona.getCedula();
		String nombre="Andres";
		List<Persona> cliente = daoPersona.getPersonas(nombre);
		return cliente;
	}
	*/
	
	
	public boolean validaCedula(String cedula) {
		if(cedula.length()==10) {
			return true;
		}else {
			return false;
		}
		
	}
}
