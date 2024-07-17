public class Membro {
    String nome, cpf, endereco, telefone, gmail;

    public Membro(String parametroNome, String parametroCpf, String paramentroEndereco, String parametroTelefone, String parametroGmail){
        nome = parametroNome;
        cpf = parametroCpf;
        endereco = paramentroEndereco;
        telefone = parametroTelefone;
        gmail = parametroGmail;
    }

    public Membro(){

    }

    public void obterDadosMembro(){
        System.out.println("-----------------------------------------------");
        System.out.println("Dados do Membro");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Endereco: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Gmail: " + gmail);
    }
}