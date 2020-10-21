package casadeeventos;


public class Quinces extends CasaDeEventos {
    
    private String nombreQuinceañera;
    private String nommbreChambelan;

    public Quinces(
            String nombre,
            int numeroDeInvitados,
            date fechaDelEvento,
            String tematica,
            Boolean disponibilidadElFindeSemana,
            String nombreQuinceañera,
            String nombreChambelan ) {
        super(
            nombre,
            numeroDeInvitados,
            fechaDelEvento,
            tematica,
            disponibilidadElFindeSemana );
        
        this.nombreQuinceañera = nombreQuinceañera;
        this.nommbreChambelan = nombreChambelan;
        
    }

    public String getNombreQuinceañera() {
        return nombreQuinceañera;
    }

    public void setNombreQuinceañera(String nombreQuinceañera) {
        this.nombreQuinceañera = nombreQuinceañera;
    }

    public String getNommbreChambelan() {
        return nommbreChambelan;
    }

    public void setNommbreChambelan(String nommbreChambelan) {
        this.nommbreChambelan = nommbreChambelan;
    }
           
    
}
