public class Hospede {
    String nome, cpf, endereco, telefone, email;

    public Hospede(String parametroNome, String parametroCpf, String parametroEndereco, String parametroTelefone, String parametroEmail){
        nome = parametroNome;
        cpf = parametroCpf;
        endereco = parametroEndereco;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Hospede(){

    }

    public void obterDadosHospede(){
        System.out.println("------------------------------------------");
        System.out.println("Dados do Hospede");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Endereco: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
