public class Arvore {
    String localizacao, estadoSaude, especie;

    public Arvore(String parametroLocalizacao, String parametroEstadoSaude, String parametroEspecie) {
        localizacao = parametroLocalizacao;
        estadoSaude = parametroEstadoSaude;
        especie = parametroEspecie;
    }

    public Arvore(){
        localizacao = "Rua";
        especie = "Pau-Brasil";
        estadoSaude = "Boa";
    }

    public void obterDadosArvore(){
        System.out.println("-----------------------------------------------");
        System.out.println("Árvore");
        System.out.print("Localização: " + localizacao);
        System.out.print(" Estado de saúde: " + estadoSaude);
        System.out.println(" Espécie: " + especie);
    }
}