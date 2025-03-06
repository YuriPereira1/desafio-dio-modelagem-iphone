import classes.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("TESTANDO APARELHO TELEFONICO!");
        System.out.println("=============================");

        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("000000000");

        System.out.println("=============================");
        System.out.println("TESTANDO REPRODUTOR MUSICAL");
        System.out.println("=============================");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("MAIS TOCADAS!");

        System.out.println("=============================");
        System.out.println("TESTANDO NAVEGADOR!");
        System.out.println("=============================");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("FERRAMENTA DE BUSCA.COM");
        iphone.atualizarPagina();

        System.out.println("=============================");
    }
}
