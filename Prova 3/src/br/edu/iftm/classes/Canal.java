package br.edu.iftm.classes;

public class Canal extends PlataformaDeStreaming {

    private int valorRecord = 5;

    public Canal(String nome, String nickname) {
        super(nome, nickname);
    }

    public void record(int valor) {
        if (valor > valorRecord) {
            super.recordViewer(valor);
            this.valorRecord = valor;
        }
    }

}
