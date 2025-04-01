public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet  {

    @Override
    public void tocar(){
       System.out.println("tocando musica");
    }

    @Override 
    public void pausar(){
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("tocando " + musica);
    }

    @Override
    public void ligar(String numero){
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender(){
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("exibindo pagina");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("atualizando pagina");
    }

    
}
