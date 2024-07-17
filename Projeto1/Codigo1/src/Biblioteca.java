public class Biblioteca {
    String nome, endereco, telefone, email;

    public Biblioteca(String parametroNome, String parametroEndereco, String parametroTelefone, String parametroEmail){
        nome = parametroNome;
        endereco = parametroEndereco;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Biblioteca(){

    }

    public void obterDadosBiblioteca(){
        System.out.println("---------------------------------------------");
        System.out.println("Biblioteca");
        System.out.print("Nome: " + nome);
        System.out.print(" Endereço: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
