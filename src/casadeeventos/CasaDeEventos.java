package casadeeventos;

public class CasaDeEventos {
    private String nombre;// Este define el nombre de la casa de eventos //
    private int numeroDeInvitados;// Este define la cantidad de invitados //
    private date fechaDelEvento;// Este define el día del evento //       
    private String tematica;// Este define la tematica de la fiesa que se manejara en la casa de eventos //
    private Boolean disponibilidadElFindeSemana;// Este define si hay espacio los fines de semana //
  
  //Atributos de composición y agregación//
    
    private Baños bañoSocial = null;
    private Personal personalDeServicio;
    
// Aqui empieza el constructor // 
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
        this.bañoSocial = new Baños(" Masculino-Femenino ",true);
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
    //Aqui empieza el método get y set de mi proyecto//
    public String getNombre() {
        return nombre;
    }

    public Baños getBañoSocial() {
        return bañoSocial;
    }

    public void setBañoSocial(Baños bañoSocial) {
        this.bañoSocial = bañoSocial;
    }

    public Personal getPersonalDeServicio() {
        return personalDeServicio;
    }

    public void setPersonalDeServicio(Personal personalDeServicio) {
        this.personalDeServicio = personalDeServicio;
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
       
        Baños bañosDelEvento = new Baños(" Masculino-Femenino ",true);
        
        CasadeEventosUno.setBañoSocial(bañosDelEvento);
        
        System.out.println("el genero de los baños es:");
        System.out.println(CasadeEventosUno.getBañoSocial().getGenero());
        System.out.println("Ha sido limpiado");
        System.out.println(CasadeEventosUno.getBañoSocial().getServicioDeLimpieza());
    }
}
