import java.util.List;

public class Hackaton extends Evento {
    private List<String> mentores; 
    private String descricao;
    private int quantidadesAlunosPorGrupo;

    public Hackaton( int codigo,
                     String titulo,
                     String nomeProfResponsavel;
                     int nroParticipantes,
                     String descricao,
                     int quantidadesAlunosPorGrupo
    ){
        super(codigo, titulo, nomeProfResponsavel, nroParticipantes);
        this.descricao = descricao;
    }
}
