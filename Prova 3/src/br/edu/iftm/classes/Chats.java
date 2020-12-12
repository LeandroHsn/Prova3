package br.edu.iftm.classes;

public class Chats extends Conversa {

    public void mandarMsg(String usuario, String mensagem) {
        this.setUsuario(usuario);
        this.setConversa(mensagem);
        System.out.printf("O usuário %s acabou de enviar uma mensagem: %s \n", getUsuario(), getConversa());
    }

    public String apagarMensagem() {
        String apagou = "Você apagou a mensagem.";
        return apagou;
    }

    public String apagarMensagem(boolean apagarMensagem) {
        if (apagarMensagem != false) {
            return apagarMensagem();
        } else {
            String naoApagou = "Você não apagou a mensagem.";
            return naoApagou;
        }
    }
}
