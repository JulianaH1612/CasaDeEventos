package casadeeventos;

public class CasaDeEventos {
    private String nombre;
    private int numeroDeInvitados;
    private date fechaDelEvento;       
    private String tematica;
    private Boolean disponibilidadElFindeSemana;
    public CasaDeEventos(
            String nombre, 
            int numeroDeInvitados, 
            date fechaDelEvento, 
            String tematica, 
            Boolean disponibilidadElFindeSemana) {
        this.nombre = nombre;
        this.numeroDeInvitados = numeroDeInvitados;
        this.fechaDelEvento = fechaDelEvento;
        this.tematica = tematica;
        this.disponibilidadElFindeSemana = disponibilidadElFindeSemana;
    }
    //El método me da a conocer el nombre del cliente que alquilará la 
    //casa de eventos
    public void nombredelCliente(){
        this.numeroDeInvitados = +80;
        this.disponibilidadElFindeSemana = true;
    }
    //Este método permite saber la tematica del evento escogido por el cliente
    public void tematica(
            String boda, 
            String grado, 
            String quinces, 
            String nombreCliente){
        this.tematica = boda;
        this.nombre = nombreCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroDeInvitados() {
        return numeroDeInvitados;
    }
    public void setNumeroDeInvitados(int numeroDeInvitados) {
        this.numeroDeInvitados = numeroDeInvitados;
    }
    public date getFechaDelEvento() {
        return fechaDelEvento;
    }
    public void setFechaDelEvento(date fechaDelEvento) {
        this.fechaDelEvento = fechaDelEvento;
    }
    public String getTematica() {
        return tematica;
    }
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    public Boolean getDisponibilidadElFindeSemana() {
        return disponibilidadElFindeSemana;
    }
    public void setDisponibilidadElFindeSemana(Boolean disponibilidadElFindeSemana) {
        this.disponibilidadElFindeSemana = disponibilidadElFindeSemana;
    }
    public static void main(String[] args) {
       CasaDeEventos CasadeEventosUno = new CasaDeEventos(
               "Camilo",
               250,
               new date(),
               "boda",
               false);
       CasaDeEventos CasadeEventosDos = new CasaDeEventos(
               "Ramón",
               120,
               new date(),
               "grado",
               true);
       
        System.out.println(CasadeEventosUno.getNumeroDeInvitados());
        System.out.println(CasadeEventosUno.getDisponibilidadElFindeSemana());
        System.out.println(CasadeEventosUno.getTematica());
        System.out.println(CasadeEventosUno.getNombre());
       
        CasadeEventosUno.nombredelCliente();
        
        System.out.println(CasadeEventosUno.getNumeroDeInvitados());
        System.out.println(CasadeEventosUno.getDisponibilidadElFindeSemana());
        System.out.println(CasadeEventosUno.getTematica());
        System.out.println(CasadeEventosUno.getNombre());
        
        System.out.println(CasadeEventosDos.getNumeroDeInvitados());
        System.out.println(CasadeEventosDos.getDisponibilidadElFindeSemana());
        System.out.println(CasadeEventosDos.getTematica());
        System.out.println(CasadeEventosDos.getNombre());
        
        CasadeEventosDos.nombredelCliente();
        
        System.out.println(CasadeEventosDos.getNumeroDeInvitados());
        System.out.println(CasadeEventosDos.getDisponibilidadElFindeSemana());
        System.out.println(CasadeEventosDos.getTematica());
        System.out.println(CasadeEventosDos.getNombre());
    }
}
