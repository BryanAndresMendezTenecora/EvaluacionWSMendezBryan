package ups.edu.pruebaWS.EvaluacionWSMendezBryan.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


import ups.edu.pruebaWS.EvaluacionWSMendezBryan.business.TituloON;
import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Titulo;

@Path("personas")
public class ServicioRs {

	@Inject
	private TituloON tituloON;
	
	@PUT
	@Path("/registrar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarTitulo(Titulo titulo) {
		Mensaje msj= new Mensaje();
		
		try {
			tituloON.insertTitulo(titulo);
			msj.setCodigo("1");
			msj.setDescripcion("Ok");
			return msj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msj.setCodigo("2");
			msj.setDescripcion("Error");
			return msj;
		}
		
	}
	
	
	
}
