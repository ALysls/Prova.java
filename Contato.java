package Prova;

public class Contato {
    
    private int celular;
    private String email;

    public Contato() {}

    public Contato(int celular, String email){

        this.celular = celular;
        this.email = email;
        
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
