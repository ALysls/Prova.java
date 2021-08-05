package Prova;

import javax.swing.JOptionPane; 

public class EntradaDados {
    
    public Estudante dadosEstudante() {  

        String nome = JOptionPane.showInputDialog(null, "Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));
        char sexo = JOptionPane.showInputDialog(null, "Sexo: ").charAt(0);

        Estudante estudante = new Estudante(nome, idade, sexo);
        return estudante;
    }

    public Contato dadosContato() {

        int celular = Integer.parseInt(JOptionPane.showInputDialog(null, "Celular: "));
        String email = JOptionPane.showInputDialog(null, "Email: ");

        Contato contato = new Contato(celular, email);
        return contato;
    }

    public Endereco dadosEndereco() {

        String pais = JOptionPane.showInputDialog(null, "Pais: ");
        char uf = JOptionPane.showInputDialog(null, "UF: ").charAt(0);
        String cidade = JOptionPane.showInputDialog(null, "Cidade: ");
        String bairro = JOptionPane.showInputDialog(null, "Bairro: ");
        String rua = JOptionPane.showInputDialog(null, "Rua: ");

        Endereco endereco = new Endereco(pais, uf, cidade, bairro, rua);
        return endereco;
    }

    public Diciplina dadosDiciplina() {

        String nomeDici = JOptionPane.showInputDialog(null, "Diciplina: ");
        String professor = JOptionPane.showInputDialog(null, "Professor: ");
        String sala = JOptionPane.showInputDialog(null, "Sala: ");
        String turno = JOptionPane.showInputDialog(null, "Turno: ");

        Diciplina diciplina = new Diciplina(nomeDici, professor, sala, turno);
        return diciplina;
    }

    public UnidadeTematica dadosUt() {

        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Primeira nota da UTI: "));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Segunda nota da UTI: "));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Primeira nota da UTII: "));
        float nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Segunda nota da UTII: "));
        
        UnidadeTematica ut = new UnidadeTematica(nota1, nota2, nota3, nota4);
        return ut;
    }

    
}
