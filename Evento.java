public abstract class Evento implements Comparable <Evento> {

	private static int codGeralSequencial = 0; //definindo o codigo sequencial iniciando em zero

	private int codigo;

	private String titulo;

	private String nomeProfResponsavel;

	private int nroParticipantes;

	//construtor
	public Evento(int codigo, String titulo, String nomeProfResponsavel, int nroParticipantes) {
		codGeralSequencial++; //codigo sequencial -> codgeralSequencial = ** + 1;
		this.codigo = codigo;
		this.titulo = titulo;
		this.nomeProfResponsavel = nomeProfResponsavel;
		this.nroParticipantes = nroParticipantes;
	}

	//getters
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getNomeProfResponsavel() {
		return nomeProfResponsavel;
	}

	public int getNroParticipantes() {
		return nroParticipantes;
	}

	public String toString() {
		return "Dados do evento:\n" +
				"Codigo:" + codGeralSequencial +
				"Titulo:" + titulo +
				"Professor responsavel:" + nomeProfResponsavel +
				"Numero de Participantes:" + nroParticipantes;
	}

	public int compareTo(Evento outroEvento) {
		return this.getCodigo() - outroEvento.getCodigo();
	}

}
