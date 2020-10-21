package casadeeventos;

public class Boda extends CasaDeEventos {
    
    private String nombreNovia;
    private String nombreNovio;

    public Boda(
            String nombre, 
            int numeroDeInvitados,
            date fechaDelEvento,
            String tematica,
            Boolean disponibilidadElFindeSemana,
            String nombreNovia,
            String nombreNovio ) {
        super(
             nombre,
             numeroDeInvitados,
             fechaDelEvento,
             tematica,
             disponibilidadElFindeSemana );
             
        this.nombreNovia = nombreNovia;
        this.nombreNovio = nombreNovio;
               
    }

    public String getNombreNovia() {
        return nombreNovia;
    }

    public void setNombreNovia(String nombreNovia) {
        this.nombreNovia = nombreNovia;
    }

    public String getNombreNovio() {
        return nombreNovio;
    }

    public void setNombreNovio(String nombreNovio) {
        this.nombreNovio = nombreNovio;
    }
    
}
