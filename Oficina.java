import java.util.List;
import java.util.LinkedList;

public class Oficina extends Evento {

	private String nomeMentor;

	private String descAtividades;

	private List<String> listaTecnologias; //arraylist do tipo String com nome listaTecnologias

	public Oficina(	int codigo,
					String titulo, 
					String nomeProfResponsavel, 
					int nroParticipantes,
					String nomeMentor,
					String descAtividades
		){
			super(codigo, titulo, nomeProfResponsavel, nroParticipantes); //super classe, Construtor eventos.
			this.nomeMentor = nomeMentor;
			this.descAtividades = descAtividades;
			this.listaTecnologias = new LinkedList<String>();
	}

	public String getNomeMentor() {
		return nomeMentor;
	}

	public String getDescricaoAtividades() {
		return descAtividades;
	}

	public List getListaTecnologias() {
		List<String> clone = new LinkedList<String>(this.listaTecnologias);
		for(String tecnlogia : this.listaTecnologias){
			clone.add(tecnlogia);
		}
		return clone;
	}

	public void adicionarTecnologia(String tecnologia) {
		this.listaTecnologias.add(tecnologia);
	}

	public String toString() {
		return super.toString() + 
			   "Evento Oficina:\n Mentor:" +
			   this.getNomeMentor() +
			   "Descricao das atividades:" + 
			   this.getDescricaoAtividades() +
			   "\nTecnologias:" +
			   this.getListaTecnologias();
	}

}
