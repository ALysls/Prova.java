package Prova;

import javax.swing.JOptionPane;

public class Relatorio {

    public static void main (String[] args) {

        String novo = "s";
        
        while(novo == "s"){
            Estudante aluno = new Estudante();
            Contato ctt = new Contato();
            Endereco end = new Endereco();
            Diciplina dici = new Diciplina();
            UnidadeTematica ut = new UnidadeTematica();

        
            aluno = new EntradaDados().dadosEstudante();
            ctt = new EntradaDados().dadosContato();
            end = new EntradaDados().dadosEndereco();
            dici = new EntradaDados().dadosDiciplina();
            ut = new EntradaDados().dadosUt();

        
            String dados = "------------ Relatório ------------" + "\nNome: " + aluno.getNome() + "\nIdade: "+ aluno.getIdade() + "\nSexo: " + aluno.getSexo() 
            + "\n\n------------ Contatos ------------" + "\nCelular: " + ctt.getCelular() + "\nEmail: " + ctt.getEmail() 
            + "\n\n------------ Endereco ------------" + "\nPais: " + end.getPais() + "\nUF: " + end.getUf() + "\nCidade: " + end.getCidade()
            + "\nBairro: " + end.getBairro() + "\nRua: " + end.getRua() + "\n\n------------ Diciplina ------------" + "\nDiciplina: " + dici.getNomeDici()
            + "\nProfessor: " + dici.getNomeDici() + "\nSala: " + dici.getSala() + "\nTurno: " + dici.getTurno() + "\n\n---------- Unidade Tematica ----------"
            + "\n- - - UTI - - -" + "\nNota 1: " + ut.getNota1() + "\nNota 2: " + ut.getNota2() + "\n\n- - - UTII - - -" + "\nNota 1: " + ut.getNota3()
            + "\nNota 2: " + ut.getNota4() + "\nMedia: " + ut.Media() + "\n------------------------" + "\n" + ut.Status() + "\n------------------------";
            

            JOptionPane.showMessageDialog(null, dados);
            novo = (JOptionPane.showInputDialog("Quer continuar (s/n)? "));
        }

     }

  
    
}
