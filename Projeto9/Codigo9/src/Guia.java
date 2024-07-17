public class Guia {
    String nome, especie, idioma;

    public Guia(String parametroNome, String parametroEspecie, String parametroIdioma){
        nome = parametroNome;
        especie = parametroEspecie;
        idioma = parametroIdioma;
    }

    public Guia(){

    }

    public void obterDadosGuia(){
        System.out.println("-----------------------------------------------");
        System.out.println("Guia");
        System.out.print("Nome: " + nome);
        System.out.print(" Espécie: " + especie);
        System.out.println(" Idioma: " + idioma);
    }
}