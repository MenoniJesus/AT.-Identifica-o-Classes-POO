public class Instrutor {
    String nome, cpf, especialidade, telefone, gmail;

    public Instrutor(String parametroNome, String parametroCpf, String parametroEspecialidade, String parametroTelefone, String parametroGmail){
        nome = parametroNome;
        cpf = parametroCpf;
        especialidade = parametroEspecialidade;
        telefone = parametroTelefone;
        gmail = parametroGmail;
    }

    public Instrutor(){
        nome = "Joao";

    }

    public void obterDadosInstrutor(){
        System.out.println("-----------------------------------------------");
        System.out.println("Dados do Instrutor");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Especialidade: " + especialidade);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Gmail: " + gmail);
    }
}