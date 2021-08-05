package Prova;

public class Endereco {
    
    private String pais;
    private char uf;
    private String cidade;
    private String bairro;
    private String rua;

    public Endereco() {}

    public Endereco(String pais, char uf, String cidade, String bairro, String rua) {

        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getUf() {
        return uf;
    }

    public void setUf(char uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

}
