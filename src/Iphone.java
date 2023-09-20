public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public Iphone(){

    }


    @Override
    public void ligar() {
        System.out.println("Ligando para alguém");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
        exibirPagina();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
}
