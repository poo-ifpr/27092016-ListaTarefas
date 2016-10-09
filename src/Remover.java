import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remover {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TarefasPU");
		EntityManager em = emf.createEntityManager();
				
		/*EntityTransaction transaction = em.getTransaction();
		transaction.begin();*/
		
		Tarefa tarefa  = em.find(Tarefa.class, 1L);
	
		em.getTransaction().begin();
		em.remove(tarefa);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}