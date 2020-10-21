package casadeeventos;


class Personal {
    private String nombreDelPersonal;
    private int añosDeExperiencia;

    public Personal(String nombreDelPersonal, int añosDeExperiencia) {
        this.nombreDelPersonal = nombreDelPersonal;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getNombreDelPersonal() {
        return nombreDelPersonal;
    }

    public void setNombreDelPersonal(String nombreDelPersonal) {
        this.nombreDelPersonal = nombreDelPersonal;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    
    
}


