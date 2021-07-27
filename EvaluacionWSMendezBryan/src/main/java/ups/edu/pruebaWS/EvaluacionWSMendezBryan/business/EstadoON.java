package ups.edu.pruebaWS.EvaluacionWSMendezBryan.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.pruebaWS.EvaluacionWSMendezBryan.dao.EstadoDAO;
import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Estado;

@Stateless
public class EstadoON {

	@Inject
	private EstadoDAO daoEstado;
	
	public void insertEstado(Estado estado) throws Exception {
		
		
		
		daoEstado.insert(estado);	
	}

	public void updateEstado(Estado estado) throws Exception {
		
		daoEstado.update(estado);
	}
	
	public void deleteEstado(int codigo) throws Exception {
		
		
		daoEstado.delete(codigo);
	}
	
	public List<Estado> getEstados() {
		
		//if(!this.validaCedula(Estado.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Estado per= daoEstado.read("0102930888");
		
		return daoEstado.getEstados("%");
	}
}
