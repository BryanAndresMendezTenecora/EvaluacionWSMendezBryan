package ups.edu.pruebaWS.EvaluacionWSMendezBryan.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.pruebaWS.EvaluacionWSMendezBryan.dao.TituloDAO;
import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Titulo;

@Stateless
public class TituloON {
	
	@Inject
	private TituloDAO daoTitulo;
	

	public void insertTitulo(Titulo titulo) throws Exception {

			
		daoTitulo.insert(titulo);	
	}

	public void updateTitulo(Titulo titulo) throws Exception {
		
		daoTitulo.update(titulo);
	}
	
	public void deleteTitulo(int codigo) throws Exception {
		
		
		daoTitulo.delete(codigo);
	}
	
	public List<Titulo> getTitulos() {
		
		//if(!this.validaCedula(Titulo.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Titulo per= daoTitulo.read("0102930888");
		
		return daoTitulo.getTitulos("%");
	}
	
	/*
	public List ListarTitulo() throws Exception {
		
		
		//String cedula= Titulo.getCedula();
		String nombre="Andres";
		List<Titulo> Titulo = daoTitulo.getTitulos(nombre);
		return Titulo;
	}
	*/

}
