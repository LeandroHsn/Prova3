package br.edu.iftm.classes;

public final class Painel {

    private String usuario;
    private String cargo;

    public Painel(String usuario, String cargo) {
        this.usuario = usuario;
        this.cargo = cargo;
    }

    public void acessar() {
        if (usuario.equalsIgnoreCase("Linconl") && cargo.equalsIgnoreCase("Moderador")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

    }

}
