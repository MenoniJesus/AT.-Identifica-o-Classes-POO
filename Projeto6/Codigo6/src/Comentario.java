public class Comentario {
    String conteudo, data;
    Usuario usuario;
    Postagem postagem;

    public Comentario(String parametroConteudo, String parametroData, Usuario parametroUsuario, Postagem parametroPostagem){
        conteudo = parametroConteudo;
        data = parametroData;
        usuario = parametroUsuario;
        postagem = parametroPostagem;
    }

    public Comentario(){

    }

    public void obterDadosComentario(){
        System.out.println("-------------------------------------");
        System.out.println("Comentário");
        System.out.print("Conteúdo: " + conteudo);
        System.out.print(" Data: " + data);
        System.out.print(" Usuário: " + usuario);
        System.out.println(" Postagem: " + postagem);
    }
}
