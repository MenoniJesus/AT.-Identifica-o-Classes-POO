public class Mensagem {
    Usuario usuario, destinatario;
    String conteudo, data;

    public Mensagem(Usuario parametroUsuario, Usuario parametroDestinatario, String parametroConteudo, String parametroData){
        usuario = parametroUsuario;
        destinatario = parametroDestinatario;
        conteudo = parametroConteudo;
        data = parametroData;
    }

    public Mensagem(){

    }

    public void obterDadosMensagem(){
        System.out.println("-------------------------------------");
        System.out.println("Mensagem");
        System.out.print("Usuário: " + usuario);
        System.out.print(" Destinatário: " + destinatario);
        System.out.print(" Conteúdo: " + conteudo);
        System.out.println(" Data: " + data);
    }
}
