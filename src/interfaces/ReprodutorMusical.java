package interfaces;

public interface ReprodutorMusical {
    default void tocar() {
        System.out.println("TOCANDO MÚSICA!");
    }

    default void pausar() {
        System.out.println("MÚSICA PAUSADA!");
    }

    default void selecionarMusica(String musica) {
        System.out.println("MUSICA " + musica + " SELECIONADA!");
    }
}
