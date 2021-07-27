package ups.edu.pruebaWS.EvaluacionWSMendezBryan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Estado;


@Stateless
public class EstadoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Estado estado) {
		em.persist(estado);
	}
	
	public void update(Estado estado) {
		em.merge(estado);
	}
	
	public Estado read(int codigo) {
		Estado p = em.find(Estado.class, codigo);
		return p;
	}
	
	public void delete(int codigo) {
		Estado p = em.find(Estado.class, codigo);
		em.remove(p);
	}
	
	public List<Estado> getEstados(String nombre){
		
		String jpql2="SELECT p FROM Estado p"
				+"WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Estado.class);
		query.setParameter(1, nombre);
		
		List<Estado> estados=query.getResultList();
		return estados;
		
	}
}
