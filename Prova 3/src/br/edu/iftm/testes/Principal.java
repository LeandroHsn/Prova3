package br.edu.iftm.testes;

import br.edu.iftm.classes.Canal;
import br.edu.iftm.classes.Chats;
import br.edu.iftm.classes.Painel;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Classe de testes:");

        Canal teste = new Canal("Leandro", "LeandroHsn");

        Painel testeAcesso = new Painel("Leandro", "Usuário");
        Painel testeAcessoCorreto = new Painel("LiNcOnl", "MoDeRaDor");
        Chats chat = new Chats();

        teste.iniciarTransmissao(true);
        teste.record(4);
        teste.record(6);
        teste.record(9);
        teste.record(9);
        teste.record(9);
        teste.record(12);
        teste.iniciarTransmissao(false);

        // uma classe do tipo final;

        testeAcesso.acessar();
        testeAcessoCorreto.acessar();

        // uma classe do tipo abstract;

        chat.mandarMsg("Leandro", "Oii");
        chat.mandarMsg("Augusto", "f");
        chat.mandarMsg("Lucas", "Olá");

        // sobrecarga de métodos;

        System.out.println(chat.apagarMensagem(true));
        System.out.println(chat.apagarMensagem(false));
        System.out.println(chat.apagarMensagem(true));
        System.out.println(chat.apagarMensagem(false));

        System.out.println(teste.doar("10 Reais"));
        System.out.println(teste.doar(10));
        System.out.println(teste.doar(10.326));

    }
}
