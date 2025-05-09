public class Palestra extends Evento {
    private String nomePalestrante;
    private String tituloPalestra;
    private String biografia;

    public Palestra(
        int codigo,
        String titulo,
        String nomeProfResponsavel,
        int nroParticipantes,
        String nomePalestrante,
        String tituloPalestra,
        String biografia
    ){
        super(codigo, titulo, nomeProfResponsavel, nroParticipantes);
        this.nomePalestrante = nomePalestrante;
        this.tituloPalestra = tituloPalestra;
        this.biografia = biografia;
    }

    //getters
    public String getNomePalestrante(){
        return nomePalestrante;
    }

    public String getTituloPalestra(){
        return tituloPalestra;
    }

    public String getBiografia(){
        return biografia;
    }

    public String toString(){
        return "Evento Palestra:\n Palestrante:" +
                nomePalestrante +
                "Titulo da Palestra:" +
                tituloPalestra +
                "Biografia:" +
                biografia;  
    }
}
