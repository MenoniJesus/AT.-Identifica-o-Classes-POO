public class Funcionario {
    String nome, telefone, email;

    public Funcionario(String parametroNome, String parametroTelefone, String parametroEmail){
        nome = parametroNome;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Funcionario(){

    }

    public void obterDadosFuncionario(){
        System.out.println("---------------------------------------------");
        System.out.println("Funcionário");
        System.out.print("Nome: " + nome);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
