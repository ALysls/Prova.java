package Prova;

public class Diciplina {

    private String nomeDici;
    private String professor;
    private String sala;
    private String turno;
    
    public Diciplina() {}

    public Diciplina(String nomeDici, String professor, String sala, String turno){
        
        this.nomeDici = nomeDici;
        this.professor = professor;
        this.sala = sala;
        this.turno = turno;

    }

    public String getNomeDici() {
        return nomeDici;
    }
    
    public void setNomeDici(String nomeDici) {
        this.nomeDici = nomeDici;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}


