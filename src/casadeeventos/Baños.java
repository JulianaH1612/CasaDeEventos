package casadeeventos;


class Baños {
    private String genero;
    private Boolean servicioDeLimpieza;

    public Baños(String genero, Boolean servicioDeLimpieza) {
        this.genero = genero;
        this.servicioDeLimpieza = servicioDeLimpieza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getServicioDeLimpieza() {
        return servicioDeLimpieza;
    }

    public void setServicioDeLimpieza(Boolean servicioDeLimpieza) {
        this.servicioDeLimpieza = servicioDeLimpieza;
    }
    
    
    
}
