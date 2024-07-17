public class Voo {
    String numeroVoo, origem, destino, horarioPartida, horarioChegada;
    float preco;
    CompanhiaAerea companhiaAerea;

    public Voo(String parametroNumeroVoo, CompanhiaAerea parametroCompanhiaAerea, String parametroOrigem, String parametroDestino, String parametroHorarioPartida, String parametroHorarioChegada, float parametroPreco) {
        numeroVoo = parametroNumeroVoo;
        companhiaAerea = parametroCompanhiaAerea;
        origem = parametroOrigem;
        destino = parametroDestino;
        horarioPartida = parametroHorarioPartida;
        horarioChegada = parametroHorarioChegada;
        preco = parametroPreco;
    }

    public Voo(){

    }

    public void obterDadosVoo() {
        System.out.println("---------------------------------------------------");
        System.out.println("Voo");
        System.out.print("Número do Voo: " + numeroVoo);
        System.out.print(" Companhia Aérea: " + companhiaAerea);
        System.out.print(" Origem: " + origem);
        System.out.print(" Destino: " + destino);
        System.out.print(" Horário de Partida: " + horarioPartida);
        System.out.print(" Horário de Chegada: " + horarioChegada);
        System.out.println(" Preço: R$" + preco);
    }
}