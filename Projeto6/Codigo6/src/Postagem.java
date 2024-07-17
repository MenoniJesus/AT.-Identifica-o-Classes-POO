public class Postagem {
    Usuario usuario;
    String conteudo, data;
    int curtidas;

    public Postagem(Usuario parametroUsuario, String parametroConteudo, String parametroData, int parametroCurtidas){
        usuario = parametroUsuario;
        conteudo = parametroConteudo;
        data = parametroData;
        curtidas = parametroCurtidas;
    }

    public Postagem(){

    }

    public void obterDadosPostagem(){
        System.out.println("-------------------------------------");
        System.out.println("Postagem");
        System.out.print("Usuário: " + usuario);
        System.out.print(" Conteúdo: " + conteudo);
        System.out.print(" Data: " + data);
        System.out.println(" Curtidas: " + curtidas);
    }
}
