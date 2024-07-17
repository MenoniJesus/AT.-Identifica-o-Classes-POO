public class Usuario {
    String nome, telefone, email, matricula, endereco, tipoUsuario;

    public Usuario(String parametroNome, String parametroTelefone, String parametroEmail, String parametroMatricula, String parametroEndereco, String parametroTipoUsuario){
        nome = parametroNome;
        telefone = parametroTelefone;
        email = parametroEmail;
        matricula = parametroMatricula;
        endereco = parametroEndereco;
        tipoUsuario = parametroTipoUsuario;
    }

    public Usuario(){
        nome = "João";
    }

    public void obterDadosUsario(){
        System.out.println("---------------------------------------------");
        System.out.println("Usuário");
        System.out.print("Nome: " + nome);
        System.out.print(" Telefone: " + telefone);
        System.out.print(" Email: " + email);
        System.out.print(" Matricula: " + matricula);
        System.out.print(" Endereço: " + endereco);
        System.out.println(" Tipo de Usuário: " + tipoUsuario);
    }
}
