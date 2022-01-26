package br.ufma.ecp.sistemalegal;

public class NaturezaCrime {
    
    private String tipo ;

    public NaturezaCrime() {
     
    }

    public NaturezaCrime(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo () {
        return tipo;
    }
    
}

