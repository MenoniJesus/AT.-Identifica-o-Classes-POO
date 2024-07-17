public class Cliente {
    String nome, cpf, endereco, telefone, email;

    public Cliente(String parametroNome, String parametroCpf, String parametroEndereco, String parametroTelefone, String parametroEmail) {
        nome = parametroNome;
        cpf = parametroCpf;
        endereco = parametroEndereco;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Cliente(){

    }

    public void obterDadosCliente(){
        System.out.println("---------------------------------------------");
        System.out.println("Cliente");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Endereço: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
