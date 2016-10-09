import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TarefasPU");
		EntityManager em = emf.createEntityManager();
		
		Tarefa tarefa = new Tarefa();
		tarefa.setNome("estudarPOO");
		tarefa.setFeita(false);
		
		/*EntityTransaction transaction = em.getTransaction();
		transaction.begin();*/
		
		em.getTransaction().begin();
		em.persist(tarefa);
		em.getTransaction().commit();
	}

}
