public class Main {
    public static void main(String[] args) {
        Perfil perfil1 = new Perfil("João", "foto1", "status1", "amigos1");
        perfil1.obterDadosPerfil();

        Usuario usuario1 = new Usuario("João", "joao@hotmail.com", "joao123", new Perfil());
        usuario1.obterDadosUsuario();

        Postagem postagem1 = new Postagem(usuario1, "conteudo1", "01/01/2021", 10);
        postagem1.obterDadosPostagem();

        Comentario comentario1 = new Comentario("conteudo1", "01/01/2021", new Usuario(), new Postagem());
        comentario1.obterDadosComentario();

        Mensagem mensagem1 = new Mensagem(new Usuario(), new Usuario(), "conteudo1", "01/01/2021");
        mensagem1.obterDadosMensagem();
    }
}
