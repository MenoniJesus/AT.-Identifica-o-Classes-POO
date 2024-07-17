public class Turista {
    String nome, especie, planetaOrigem, dataChegada, periodoEstadia;

    public Turista(String parametroNome, String parametroEspecie, String parametroPlanetaOrigem, String parametroDataChegada, String parametroPeriodoEstadia) {
        nome = parametroNome;
        especie = parametroEspecie;
        planetaOrigem = parametroPlanetaOrigem;
        dataChegada = parametroDataChegada;
        periodoEstadia = parametroPeriodoEstadia;
    }

    public Turista(){

    }

    public void obterDadosTurista(){
        System.out.println("-----------------------------------------------");
        System.out.println("Turista");
        System.out.print("Nome: " + nome);
        System.out.print(" Espécie: " + especie);
        System.out.print(" Planeta de Origem: " + planetaOrigem);
        System.out.print(" Data de Chegada: " + dataChegada);
        System.out.println(" Período de Estadia: " + periodoEstadia);
    }
}
