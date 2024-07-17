public class Manutencao {
    String data, atividade;
    Arvore arvore;

    public Manutencao(String parametroData, String parametroAtividade, Arvore parametroArvore) {
        data = parametroData;
        atividade = parametroAtividade;
        arvore = parametroArvore;
    }

    public Manutencao(){

    }

    public void obterDadosManutencao(){
        System.out.println("-----------------------------------------------");
        System.out.println("Manutenção");
        System.out.print("Data da manutenção: " + data);
        System.out.print(" Atividade: " + atividade);
        System.out.println(" Árvore: " + arvore.especie);
    }
}
