import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Alterar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TarefasPU");
		EntityManager em = emf.createEntityManager();
				
		/*EntityTransaction transaction = em.getTransaction();
		transaction.begin();*/
		
		Tarefa tarefa  = em.find(Tarefa.class, 1L);
		System.out.println("antes = "+tarefa);
		
		tarefa.setFeita(true);
		em.getTransaction().begin();
		em.merge(tarefa);
		em.getTransaction().commit();
		System.out.println("depois = "+tarefa);
		
		em.close();
		emf.close();
	}

}
