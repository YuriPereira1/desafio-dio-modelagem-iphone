package interfaces;

public interface AparelhoTelefonico {
    default void ligar(String numero) {
        System.out.println("LIGANDO PARA NÚMERO " + numero);
    }

    default void atender() {
        System.out.println("LIGAÇÃO ATENDIDA!");
    }

    default void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO!");
    }
}
