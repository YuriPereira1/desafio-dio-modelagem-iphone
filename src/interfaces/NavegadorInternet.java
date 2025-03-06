package interfaces;

public interface NavegadorInternet {
    default void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);
    }

    default void adicionarNovaAba() {
        System.out.println("NOVA ABA ABERTA!");
    }

    default void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA!");
    }
}
