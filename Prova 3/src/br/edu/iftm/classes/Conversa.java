package br.edu.iftm.classes;

public class Conversa {

    private String usuario;
    private String conversa;

    public String conversar() {
        return conversa;
    }

    public String nomeUsuario() {
        return usuario;
    }

    /**
     * @return String return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return String return the conversa
     */
    public String getConversa() {
        return conversa;
    }

    /**
     * @param conversa the conversa to set
     */
    public void setConversa(String conversa) {
        this.conversa = conversa;
    }

}
