public class Advogado {
    String nome, oab, especialidade, telefone, email;

    public Advogado(String parametroNome, String parametroOab, String parametroEspecialidade, String parametroTelefone, String parametroEmail) {
        nome = parametroNome;
        oab = parametroOab;
        especialidade = parametroEspecialidade;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Advogado(){

    }

    public void obterDadosAdvogado(){
        System.out.println("---------------------------------------------");
        System.out.println("Advogado");
        System.out.print("Nome: " + nome);
        System.out.print(" OAB: " + oab);
        System.out.print(" Especialidade: " + especialidade);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
