public class Funcionario {
    String nome, cpf, cargo, telefone, email;

    public Funcionario(String parametroNome, String parametroCpf, String parametroCargo, String parametroTelefone, String parametroEmail){
        nome = parametroNome;
        cpf = parametroCpf;
        cargo = parametroCargo;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Funcionario(){

    }

    public void obterDadosFuncionario(){
        System.out.println("------------------------------------------");
        System.out.println("Dados do Funcionario");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Cargo: " + cargo);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}