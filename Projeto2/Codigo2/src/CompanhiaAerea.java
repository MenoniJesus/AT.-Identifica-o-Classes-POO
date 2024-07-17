public class CompanhiaAerea {
    String nome, codigo, telefone, email;

    public CompanhiaAerea(String parametroNome, String parametroCodigo, String parametroTelefone, String parametroEmail) {
        nome = parametroNome;
        codigo = parametroCodigo;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public CompanhiaAerea(){
        nome = "GOL";

    }

    public void obterDadosCompanhiaArea() {
        System.out.println("---------------------------------------------------");
        System.out.println("Companhia Aerea");
        System.out.print("Nome: " + nome);
        System.out.print(" Código: " + codigo);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}