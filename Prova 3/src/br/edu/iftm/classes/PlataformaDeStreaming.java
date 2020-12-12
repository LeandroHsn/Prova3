package br.edu.iftm.classes;

public class PlataformaDeStreaming {

    private String nome;
    private String nickname;
    private int viewer;
    private boolean iniciarTransmissao;

    public PlataformaDeStreaming(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void recordViewer(int valor) {
        if (valor > viewer) {
            System.out.printf("A transmissão bateu o record de viwer (%d viewers)simultaneos. Parabéns!!! \n", valor);
        }
    }

    public final void iniciarTransmissao(boolean iniciartransmissao) {
        if (iniciartransmissao != true) {
            System.out.printf("%s de nickname %s está com a transmissão offline.\n", getNome(), getNickname());
        } else {
            System.out.printf("%s de nickname %s está com a transmissão online.\n", getNome(), getNickname());
        }
    }

    public int doar(int valor) {
        System.out.printf("O valor doado foi de em INT: ");
        return valor;
    }

    public Double doar(Double valor) {
        System.out.printf("O valor doado foi de FLOAT: ");
        return valor;
    }

    public String doar(String valor) {
        System.out.printf("O valor doado foi de STRING: ");
        return valor;

    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return boolean return the iniciarTransmissao
     */
    public boolean isIniciarTransmissao() {
        return iniciarTransmissao;
    }

    /**
     * @param iniciarTransmissao the iniciarTransmissao to set
     */
    public void setIniciarTransmissao(boolean iniciarTransmissao) {
        this.iniciarTransmissao = iniciarTransmissao;
    }

}
