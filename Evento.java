public abstract class Evento implements Comparable {

	private static int codGeralSequencial = 0;

	private int codigo;

	private String titulo;

	private String nomeProfResponsavel;

	private int nroParticipantes;

	public Evento(String titulo, String nomeProfessor, int nroParticip) {

	}

	public int getCodigo() {
		return 0;
	}

	public String getTitulo() {
		return null;
	}

	public String getNomeProfResponsavel() {
		return null;
	}

	public int getNroParticipantes() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public int compareTo(Evento outroEvento) {
		return 0;
	}

}
