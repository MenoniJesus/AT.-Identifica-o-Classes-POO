public class Acomodacao {
    String tipo, localizacao;
    float preco;
    boolean disponibilidade;

    public Acomodacao(String parametroTipo, String parametroLocalizacao, float parametroPreco, boolean parametroDisponibilidade){
        tipo = parametroTipo;
        localizacao = parametroLocalizacao;
        preco = parametroPreco;
        disponibilidade = parametroDisponibilidade;
    }

    public Acomodacao(){

    }

    public void obterDadosAcomodacao(){
        System.out.println("-----------------------------------------------");
        System.out.println("Acomodação");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Localização: " + localizacao);
        System.out.print(" Preço: " + preco);
        System.out.println(" Disponibilidade: " + disponibilidade);
    }
}