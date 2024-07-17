import java.awt.*;

public class Hospital {
    String nome, localizacao, telefone;
    int leitos;

    public Hospital(String parametroNome, String parametroLocalizacao, String parametroTelefone, int parametroLeitos){
        nome = parametroNome;
        localizacao = parametroLocalizacao;
        telefone = parametroTelefone;
        leitos = parametroLeitos;
    }

    public Hospital(){

    }

    public void obterDadosHospital(){
        System.out.println("------------------------------------------");
        System.out.println("Hospital");
        System.out.print("Nome: " + nome);
        System.out.print(" Localização: " + localizacao);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Leitos: " + leitos);
    }
}
