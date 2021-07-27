package ups.edu.pruebaWS.EvaluacionWSMendezBryan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.pruebaWS.EvaluacionWSMendezBryan.modelo.Titulo;


@Stateless
public class TituloDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Titulo titulo) {
		em.persist(titulo);
	}
	
	public void update(Titulo titulo) {
		em.merge(titulo);
	}
	
	public Titulo read(int codigo) {
		Titulo p = em.find(Titulo.class, codigo);
		return p;
	}
	
	public void delete(int codigo) {
		Titulo p = em.find(Titulo.class, codigo);
		em.remove(p);
	}
	
	public List<Titulo> getTitulos(String nombre){
		
		String jpql2="SELECT p FROM Titulo p"
				+"WHERE nombre LIKE ?1";
		
		nombre= nombre+"%";
		Query query= em.createQuery(jpql2, Titulo.class);
		query.setParameter(1, nombre);
		
		List<Titulo> titulos=query.getResultList();
		return titulos;
		
	}
}
