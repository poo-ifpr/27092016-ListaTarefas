import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, length = 51)
	private String nome;

	@Column(nullable = false)
	private boolean feita;

	public Tarefa() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFeita() {
		return feita;
	}

	public void setFeita(boolean feita) {
		this.feita = feita;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", nome=" + nome + ", feita=" + feita + "]";
	}

}
