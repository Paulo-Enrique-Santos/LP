package sptech.school.projeto.relacionamento;

import java.util.List;



public class App {
    public static void main(String[] args) {
        Grupo g = new Grupo("2ADSA");
        
        Contato marcelo = new Contato("Marcelo", "9999-0000");
        Contato neymar = new Contato("Neymar", "88888-0000");
        Contato lateral = new Contato("LATERAL", "LATERAL-LATERAL");
        
        g.adiciona(marcelo);
        g.adiciona(neymar);
        g.adiciona(lateral);

        
        List<Contato> contatos = g.getContatos();
        
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
        }
        
    }
}
