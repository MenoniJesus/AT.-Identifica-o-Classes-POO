public class Usuario {
    String nome, email, senha;
    Perfil perfil;

    public Usuario(String parametroNome, String parametroEmail, String parametroSenha, Perfil parametroPerfil){
        nome = parametroNome;
        email = parametroEmail;
        senha = parametroSenha;
        perfil = parametroPerfil;
    }

    public Usuario(){

    }

    public void obterDadosUsuario(){
        System.out.println("-------------------------------------");
        System.out.println("Usuário");
        System.out.print("Nome: " + nome);
        System.out.print(" Email: " + email);
        System.out.print(" Senha: " + senha);
        System.out.println(" Perfil: " + perfil);
    }
}